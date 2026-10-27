package javax.microedition.lcdui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Graphics extends lib.Graphics {
    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) { super.drawArc(x, y, width, height, startAngle, arcAngle); }
    public static final int HCENTER = 1;
    public static final int VCENTER = 2;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int TOP = 16;
    public static final int BOTTOM = 32;
    public static final int BASELINE = 64;
    public static final int SOLID = 0;
    public static final int DOTTED = 1;

    private Font currentFont = Font.getDefaultFont();
    private static BitmapFont defaultBitmapFont;

    public Graphics(SpriteBatch g) {
        super(g);
    }

    public void setFont(Font font) {
        this.currentFont = (font != null) ? font : Font.getDefaultFont();
    }

    public Font getFont() {
        return currentFont;
    }

    public void clipRect(int x, int y, int width, int height) {
        setClip(x, y, width, height);
    }

    public void drawString(String str, int x, int y, int anchor) {
        if (str == null || str.isEmpty()) return;
        if (graphics == null) return;
        if (defaultBitmapFont == null) {
            try {
                defaultBitmapFont = new BitmapFont();
            } catch (Exception ignored) {
            }
        }
        if (defaultBitmapFont != null) {
            int drawX = x + getTranslateX();
            int drawY = y + getTranslateY();
            if ((anchor & RIGHT) != 0) {
                drawX -= currentFont.stringWidth(str);
            } else if ((anchor & HCENTER) != 0) {
                drawX -= currentFont.stringWidth(str) / 2;
            }
            if ((anchor & BOTTOM) != 0) {
                drawY -= currentFont.getHeight();
            } else if ((anchor & VCENTER) != 0) {
                drawY -= currentFont.getHeight() / 2;
            }
            defaultBitmapFont.draw(graphics, str, drawX, drawY);
        }
    }

    public void drawSubstring(String str, int offset, int len, int x, int y, int anchor) {
        if (str == null) return;
        if (offset < 0 || len < 0 || offset + len > str.length()) return;
        drawString(str.substring(offset, offset + len), x, y, anchor);
    }

    public void drawChar(char character, int x, int y, int anchor) {
        drawString(String.valueOf(character), x, y, anchor);
    }

    public void drawChars(char[] data, int offset, int length, int x, int y, int anchor) {
        if (data == null || offset < 0 || length < 0 || offset + length > data.length) return;
        drawString(new String(data, offset, length), x, y, anchor);
    }

    public void copyArea(int x_src, int y_src, int width, int height, int x_dest, int y_dest, int anchor) {
    }
}
