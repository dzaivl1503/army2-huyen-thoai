package javax.microedition.lcdui;

public class Font {
    public static final int STYLE_PLAIN = 0;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_UNDERLINED = 4;

    public static final int SIZE_SMALL = 8;
    public static final int SIZE_MEDIUM = 0;
    public static final int SIZE_LARGE = 16;

    public static final int FACE_SYSTEM = 0;
    public static final int FACE_MONOSPACE = 32;
    public static final int FACE_PROPORTIONAL = 64;

    private static final Font DEFAULT_FONT = new Font(FACE_SYSTEM, STYLE_PLAIN, SIZE_MEDIUM);

    private final int face;
    private final int style;
    private final int size;

    public Font(int face, int style, int size) {
        this.face = face;
        this.style = style;
        this.size = size;
    }

    public static Font getDefaultFont() {
        return DEFAULT_FONT;
    }

    public static Font getFont(int face, int style, int size) {
        return new Font(face, style, size);
    }

    public int getHeight() {
        switch (size) {
            case SIZE_SMALL: return 12;
            case SIZE_LARGE: return 18;
            default: return 14;
        }
    }

    public int stringWidth(String str) {
        if (str == null) return 0;
        int baseCharWidth = (size == SIZE_SMALL) ? 6 : (size == SIZE_LARGE ? 9 : 7);
        return str.length() * baseCharWidth;
    }

    public int substringWidth(String str, int offset, int len) {
        if (str == null || offset < 0 || len < 0 || offset + len > str.length()) return 0;
        return stringWidth(str.substring(offset, offset + len));
    }

    public int charWidth(char ch) {
        return (size == SIZE_SMALL) ? 6 : (size == SIZE_LARGE ? 9 : 7);
    }

    public int charsWidth(char[] ch, int offset, int length) {
        if (ch == null || offset < 0 || length < 0 || offset + length > ch.length) return 0;
        return stringWidth(new String(ch, offset, length));
    }

    public int getStyle() { return style; }
    public int getSize() { return size; }
    public int getFace() { return face; }
    public boolean isPlain() { return style == STYLE_PLAIN; }
    public boolean isBold() { return (style & STYLE_BOLD) != 0; }
    public boolean isItalic() { return (style & STYLE_ITALIC) != 0; }
    public boolean isUnderlined() { return (style & STYLE_UNDERLINED) != 0; }
    public int getBaselinePosition() { return getHeight() - 2; }
}
