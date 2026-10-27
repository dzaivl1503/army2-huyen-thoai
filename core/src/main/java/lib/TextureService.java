package lib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;
import com.badlogic.gdx.utils.ScreenUtils;
import screen.Main;

public class TextureService {
    public static TextureService instance = new TextureService();

    public Texture getImageFromPath(String path) {
        try {
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            final FileHandle fileHandle = Gdx.files.internal(path);
            return createTextureSafely(fileHandle);
        } catch (Exception ignored) {
        }
        return null;
    }

    public Texture TextureRegionToTextureSafely(final TextureRegion region) {
        if (region == null) return null;
        try {
            if (Main.isRenderThread()) {
                return TextureRegionToTexture(region);
            } else {
                return region.getTexture();
            }
        } catch (Exception e) {
            return region.getTexture();
        }
    }

    public Texture TextureRegionToTexture(TextureRegion region) {
        final int width = region.getRegionWidth();
        final int height = region.getRegionHeight();
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid TextureRegion dimensions");
        }
        FrameBuffer frameBuffer = new FrameBuffer(Pixmap.Format.RGBA8888, width, height, false);
        frameBuffer.begin();
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        SpriteBatch spriteBatch = new SpriteBatch();
        spriteBatch.begin();
        spriteBatch.draw(region, 0, 0);
        spriteBatch.end();
        Pixmap pixmap = Pixmap.createFromFrameBuffer(0, 0, width, height);
        Texture texture = new Texture(pixmap);
        pixmap.dispose();
        frameBuffer.end();
        frameBuffer.dispose();
        spriteBatch.dispose();
        return texture;
    }

    public Texture createTextureRGBSafely(final int[] encodedData, int w, int h) {
        if (!Main.isRenderThread()) {
            return null;
        }
        try {
            return createRGBTexture(encodedData, w, h);
        } catch (Exception ignored) {
        }
        return null;
    }

    public Texture createRGBTexture(final int[] encodedData, int w, int h) {
        Pixmap p = new Pixmap(w, h, Pixmap.Format.RGBA8888);
        for (int i = 0; i < w; ++i) {
            for (int j = 0; j < h; ++j) {
                if (encodedData[j * w + i] != 16777215 && encodedData[j * w + i] != -16777215) {
                    p.setColor(setColor(encodedData[j * w + i]));
                } else {
                    p.setColor(new Color(0.0F, 0.0F, 0.0F, 0.0F));
                }
                p.drawPixel(i, j);
            }
        }
        Texture texture = new Texture(p);
        texture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        p.dispose();
        return texture;
    }

    public static Color setColor(int rgb) {
        float R = (float) (rgb >> 16 & 255);
        float G = (float) (rgb >> 8 & 255);
        float B = (float) (rgb & 255);
        float b = B / 256.0F;
        float g = G / 256.0F;
        float r = R / 256.0F;
        return new Color(r, g, b, 1.0F);
    }

    public Texture createTextureSafely(Pixmap pixmap) {
        if (!Main.isRenderThread() || pixmap == null || pixmap.isDisposed()) {
            return null;
        }
        try {
            return new Texture(pixmap);
        } catch (Exception ignored) {
        }
        return null;
    }

    public Texture createTextureSafely(int w, int h) {
        if (!Main.isRenderThread() || w <= 0 || h <= 0) {
            return null;
        }
        try {
            return new Texture(w, h, Pixmap.Format.RGBA8888);
        } catch (Exception ignored) {
        }
        return null;
    }

    public Texture spriteBatchToTexture(final SpriteBatch spriteBatch, final Runnable drawingCode, final int width, final int height) {
        if (!Main.isRenderThread()) {
            return null;
        }
        FrameBuffer frameBuffer = new FrameBuffer(Pixmap.Format.RGBA8888, width, height, false);
        frameBuffer.begin();
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.getProjectionMatrix().setToOrtho2D(0, 0, width, height);
        spriteBatch.begin();
        drawingCode.run();
        spriteBatch.end();
        Pixmap pixmap = ScreenUtils.getFrameBufferPixmap(0, 0, width, height);
        frameBuffer.end();
        frameBuffer.dispose();
        Texture result = new Texture(pixmap);
        pixmap.dispose();
        return result;
    }

    public Texture createTextureSafely(FileHandle fileHandle) {
        if (!Main.isRenderThread() || fileHandle == null || !fileHandle.exists()) {
            return null;
        }
        try {
            return new Texture(fileHandle);
        } catch (Exception ignored) {
        }
        return null;
    }

    public Texture createTextureSafely(byte[] data, int offset, int length) {
        if (!Main.isRenderThread() || data == null || length <= 0) {
            return null;
        }
        try {
            return createTexture(data, offset, length);
        } catch (Exception ignored) {
        }
        return null;
    }

    private Texture createTexture(byte[] data, int offset, int length) {
        try {
            Pixmap pixmap = new Pixmap(data, offset, length);
            Texture texture = new Texture(pixmap);
            pixmap.dispose();
            return texture;
        } catch (Exception ignored) {
        }
        return null;
    }
}
