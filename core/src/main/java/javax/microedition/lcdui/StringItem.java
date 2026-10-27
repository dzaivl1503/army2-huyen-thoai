package javax.microedition.lcdui;

public class StringItem extends Item {
    private String text;

    public StringItem(String label, String text) {
        super(label);
        this.text = text != null ? text : "";
    }

    public StringItem(String label, String text, int appearanceMode) {
        this(label, text);
    }

    public String getText() { return text; }
    public void setText(String text) { this.text = text != null ? text : ""; }
}
