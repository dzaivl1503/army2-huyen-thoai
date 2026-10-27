package javax.microedition.lcdui;

public class TextBox extends Displayable {
    public static final int ANY = 0;
    public static final int NUMERIC = 2;
    public static final int PHONENUMBER = 3;
    public static final int PASSWORD = 0x10000;

    private String text;
    private int maxSize;
    private int constraints;

    public TextBox(String title, String text, int maxSize, int constraints) {
        setTitle(title);
        this.text = text != null ? text : "";
        this.maxSize = maxSize;
        this.constraints = constraints;
    }

    public String getString() { return text; }
    public void setString(String text) { this.text = text != null ? text : ""; }
    public int size() { return text.length(); }
    public int getMaxSize() { return maxSize; }
    public int setMaxSize(int maxSize) { this.maxSize = maxSize; return maxSize; }
    public int getConstraints() { return constraints; }
    public void setConstraints(int constraints) { this.constraints = constraints; }
}
