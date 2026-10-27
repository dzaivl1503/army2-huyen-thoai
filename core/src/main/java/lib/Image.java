package lib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import screen.Main;

import java.io.IOException;

public class Image {
    public Texture texture;
    public int width;
    public int height;
    public Pixmap cachedPixmap;

    public Image() {
    }

    public Image(Texture texture) {
        this.texture = texture;
        if (texture != null) {
            this.width = texture.getWidth();
            this.height = texture.getHeight();
        }
    }

    public Image(TextureRegion region) {
        if (region != null) {
            this.texture = region.getTexture();
            this.width = region.getRegionWidth();
            this.height = region.getRegionHeight();
        }
    }

    public Image(Texture texture, Pixmap pixmap) {
        this.texture = texture;
        this.width = pixmap != null ? pixmap.getWidth() : (texture != null ? texture.getWidth() : 0);
        this.height = pixmap != null ? pixmap.getHeight() : (texture != null ? texture.getHeight() : 0);
        if (pixmap != null && !pixmap.isDisposed()) {
            this.cachedPixmap = new Pixmap(pixmap.getWidth(), pixmap.getHeight(), pixmap.getFormat());
            this.cachedPixmap.drawPixmap(pixmap, 0, 0);
        }
    }

    public Texture getTexture() {
        Texture t = this.texture;
        if (t == null && this.cachedPixmap != null) {
            if (Main.isRenderThread()) {
                synchronized (this) {
                    if (this.texture == null && this.cachedPixmap != null && !this.cachedPixmap.isDisposed()) {
                        try {
                            this.texture = t = new Texture(this.cachedPixmap);
                        } catch (Throwable e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return this.texture;
    }

    public static Image createImage(final String url) throws IOException {
        if (url == null) return null;
        String path = url.startsWith("/") ? url.substring(1) : url;
        Pixmap pixmap = null;
        try {
            if (Gdx.files != null && Gdx.files.internal(path).exists()) {
                pixmap = new Pixmap(Gdx.files.internal(path));
            } else if (Gdx.files != null && Gdx.files.classpath(path).exists()) {
                pixmap = new Pixmap(Gdx.files.classpath(path));
            }
        } catch (Throwable ignored) {
        }
        if (pixmap == null) {
            try {
                java.io.InputStream is = game.DataUtils.java_io_InputStream_a(url);
                if (is != null) {
                    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
                    byte[] buf = new byte[4096];
                    int r;
                    while ((r = is.read(buf)) != -1) baos.write(buf, 0, r);
                    is.close();
                    byte[] data = baos.toByteArray();
                    return createImage(data, 0, data.length);
                }
            } catch (Throwable ignored) {
            }
        }
        if (pixmap == null) return null;
        Texture texture = Main.isRenderThread() ? new Texture(pixmap) : null;
        Image img = new Image(texture, pixmap);
        pixmap.dispose();
        return img;
    }

    public static Image createImage(final Pixmap pixmap) {
        if (pixmap == null) return null;
        Texture texture = Main.isRenderThread() ? new Texture(pixmap) : null;
        return new Image(texture, pixmap);
    }

    public static Image createImage(byte[] encodedData, int offset, int len) {
        if (encodedData == null || len <= 0) return null;
        try {
            Pixmap pixmap = new Pixmap(encodedData, offset, len);
            Texture texture = Main.isRenderThread() ? new Texture(pixmap) : null;
            Image img = new Image(texture, pixmap);
            pixmap.dispose();
            return img;
        } catch (Throwable ignored) {
            return null;
        }
    }

    public static Image createImage(final int[] rgbData, final int w, final int h) {
        if (w <= 0 || h <= 0 || rgbData == null) return null;
        try {
            Pixmap pixmap = new Pixmap(w, h, Pixmap.Format.RGBA8888);
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    int argb = rgbData[y * w + x];
                    int A = (argb >>> 24) & 0xFF;
                    if (A > 0 && (argb & 0x00FFFFFF) != 0x00FFFFFF || A == 255) {
                        int R = (argb >> 16) & 0xFF;
                        int G = (argb >> 8) & 0xFF;
                        int B = argb & 0xFF;
                        pixmap.drawPixel(x, y, (R << 24) | (G << 16) | (B << 8) | A);
                    }
                }
            }
            Texture texture = Main.isRenderThread() ? new Texture(pixmap) : null;
            Image img = new Image(texture, pixmap);
            pixmap.dispose();
            return img;
        } catch (Throwable ignored) {
            return null;
        }
    }

    public static Image createImage(Image source, int x, int y, int width, int height, int transform) {
        if (source == null) return null;
        boolean flipX = false, flipY = false, swapDimensions = false;
        switch (transform) {
            case 5: flipX = true; flipY = true; swapDimensions = true; break;
            case 3: flipX = true; flipY = true; break;
            case 6: swapDimensions = true; break;
            case 2: flipX = true; break;
            case 7: flipX = true; swapDimensions = true; break;
            case 1: flipY = true; break;
            case 4: flipY = true; swapDimensions = true; break;
        }

        if (source.cachedPixmap != null && !source.cachedPixmap.isDisposed()) {
            int finalW = swapDimensions ? height : width;
            int finalH = swapDimensions ? width : height;
            Pixmap cropped = new Pixmap(finalW, finalH, source.cachedPixmap.getFormat());
            for (int dy = 0; dy < height; dy++) {
                for (int dx = 0; dx < width; dx++) {
                    int srcPixel = source.cachedPixmap.getPixel(x + dx, y + dy);
                    int targetX = flipX ? (width - 1 - dx) : dx;
                    int targetY = flipY ? (height - 1 - dy) : dy;
                    if (swapDimensions) {
                        cropped.drawPixel(targetY, targetX, srcPixel);
                    } else {
                        cropped.drawPixel(targetX, targetY, srcPixel);
                    }
                }
            }
            Texture texture = Main.isRenderThread() ? new Texture(cropped) : null;
            Image img = new Image(texture, cropped);
            cropped.dispose();
            return img;
        }

        Texture tex = source.getTexture();
        if (tex != null) {
            TextureRegion region = new TextureRegion(tex, x, y, width, height);
            if (flipX) region.flip(true, false);
            if (flipY) region.flip(false, true);
            if (swapDimensions) {
                float u = region.getU(), v = region.getV();
                float u2 = region.getU2(), v2 = region.getV2();
                region.setRegion(u, v2, u2, v);
            }
            return new Image(region);
        }

        return new Image();
    }

    public static Image createImage(final int w, final int h) {
        if (w <= 0 || h <= 0) return null;
        Pixmap pixmap = new Pixmap(w, h, Pixmap.Format.RGBA8888);
        Texture texture = Main.isRenderThread() ? new Texture(pixmap) : null;
        Image img = new Image(texture, pixmap);
        pixmap.dispose();
        return img;
    }

    public static Image createRGBImage(int[] rgb, int w, int h, boolean bl) {
        return createImage(rgb, w, h);
    }

    public static Image thuNhoMotNua(Image src) {
        if (src == null) {
            return null;
        }
        int w = src.getWidth();
        int h = src.getHeight();
        int newW = w / 2;
        int newH = h / 2;
        if (newW <= 0 || newH <= 0) {
            return src;
        }

        try {
            int[] srcPix = new int[w * h];
            src.getRGB(srcPix, 0, w, 0, 0, w, h);
            int[] dstPix = new int[newW * newH];

            for (int y = 0; y < newH; ++y) {
                int srcRow1 = (y << 1) * w;
                int srcRow2 = srcRow1 + w;
                int dstRow = y * newW;

                for (int x = 0; x < newW; ++x) {
                    int srcCol = x << 1;
                    int p0 = srcPix[srcRow1 + srcCol];
                    int p1 = srcPix[srcRow1 + srcCol + 1];
                    int p2 = srcPix[srcRow2 + srcCol];
                    int p3 = srcPix[srcRow2 + srcCol + 1];

                    int a = (((p0 >>> 24) + (p1 >>> 24) + (p2 >>> 24) + (p3 >>> 24)) + 2) >> 2;
                    if (a == 0) {
                        dstPix[dstRow + x] = 0;
                    } else {
                        int r = (((p0 >> 16 & 255) + (p1 >> 16 & 255) + (p2 >> 16 & 255) + (p3 >> 16 & 255)) + 2) >> 2;
                        int g = (((p0 >> 8 & 255) + (p1 >> 8 & 255) + (p2 >> 8 & 255) + (p3 >> 8 & 255)) + 2) >> 2;
                        int b = (((p0 & 255) + (p1 & 255) + (p2 & 255) + (p3 & 255)) + 2) >> 2;
                        dstPix[dstRow + x] = (a << 24) | (r << 16) | (g << 8) | b;
                    }
                }
            }
            return createRGBImage(dstPix, newW, newH, true);
        } catch (Exception e) {
            return src;
        }
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public static int argb(int alpha, int red, int green, int blue) {
        return (alpha << 24) | (red << 16) | (green << 8) | blue;
    }

    public void getRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height) {
        if (rgbData == null) throw new NullPointerException("rgbData is null");
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("width or height <= 0");
        if (x < 0 || y < 0 || x + width > getWidth() || y + height > getHeight())
            throw new ArrayIndexOutOfBoundsException("Exceeds image bounds");
        if (scanlength < width) throw new IllegalArgumentException("scanlength < width");
        if (offset < 0 || offset + (height - 1) * scanlength + width > rgbData.length)
            throw new ArrayIndexOutOfBoundsException("rgbData too small");
        if (cachedPixmap == null || cachedPixmap.isDisposed())
            throw new IllegalStateException("No cachedPixmap — image created without pixmap source");

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                int rgba = cachedPixmap.getPixel(x + col, y + row); // RGBA8888
                int R = (rgba >> 24) & 0xFF;
                int G = (rgba >> 16) & 0xFF;
                int B = (rgba >> 8) & 0xFF;
                int A = (rgba) & 0xFF;
                rgbData[offset + row * scanlength + col] = (A << 24) | (R << 16) | (G << 8) | B;
            }
        }
    }

    public void dispose() {
        if (texture != null) {
            try { texture.dispose(); } catch (Throwable ignored) {}
            texture = null;
        }
        if (cachedPixmap != null && !cachedPixmap.isDisposed()) {
            try { cachedPixmap.dispose(); } catch (Throwable ignored) {}
            cachedPixmap = null;
        }
    }
}
