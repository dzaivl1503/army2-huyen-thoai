package javax.microedition.lcdui;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Image extends lib.Image {

    public Image() {
        super();
    }

    public Image(Texture texture) {
        super(texture);
    }

    public Image(TextureRegion region) {
        super(region);
    }

    public static Image createImage(String url) {
        try {
            lib.Image base = lib.Image.createImage(url);
            return wrap(base);
        } catch (Exception e) {
            return null;
        }
    }

        public static Image createImage(java.io.InputStream is) throws java.io.IOException {
        if (is == null) return null;
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int r;
        while ((r = is.read(buf)) != -1) {
            baos.write(buf, 0, r);
        }
        byte[] bytes = baos.toByteArray();
        return createImage(bytes, 0, bytes.length);
    }
    public static Image createImage(byte[] encodedData, int offset, int len) {
        lib.Image base = lib.Image.createImage(encodedData, offset, len);
        return wrap(base);
    }

    public static Image createImage(int[] rgbData, int w, int h) {
        lib.Image base = lib.Image.createImage(rgbData, w, h);
        return wrap(base);
    }

    public static Image createImage(Image source, int x, int y, int width, int height, int transform) {
        lib.Image base = lib.Image.createImage(source, x, y, width, height, transform);
        return wrap(base);
    }

    public static Image createImage(lib.Image source, int x, int y, int width, int height, int transform) {
        lib.Image base = lib.Image.createImage(source, x, y, width, height, transform);
        return wrap(base);
    }

    public static Image createImage(int w, int h) {
        lib.Image base = lib.Image.createImage(w, h);
        return wrap(base);
    }

    public static Image createImage(Image source) {
        if (source == null) return null;
        return createImage(source, 0, 0, source.getWidth(), source.getHeight(), 0);
    }

    public static Image createRGBImage(int[] rgb, int w, int h, boolean processAlpha) {
        lib.Image base = lib.Image.createRGBImage(rgb, w, h, processAlpha);
        return wrap(base);
    }

    public Graphics getGraphics() {
        return new Graphics(null);
    }

    private static Image wrap(lib.Image base) {
        if (base == null) return null;
        if (base instanceof Image) return (Image) base;
        Image img = new Image();
        img.texture = base.texture;
        img.cachedPixmap = base.cachedPixmap;
        img.width = base.width;
        img.height = base.height;
        return img;
    }
}
