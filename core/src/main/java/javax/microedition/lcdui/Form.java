package javax.microedition.lcdui;

import java.util.Vector;

public class Form extends Displayable {
    private final Vector<Item> items = new Vector<>();

    public Form(String title) {
        setTitle(title);
    }

    public Form(String title, Item[] items) {
        setTitle(title);
        if (items != null) {
            for (Item item : items) {
                append(item);
            }
        }
    }

    public int append(Item item) {
        if (item != null) {
            items.addElement(item);
            return items.size() - 1;
        }
        return -1;
    }

    public int append(String str) {
        return append(new StringItem(null, str));
    }

    public int append(Image img) {
        return append(new StringItem(null, "[Image]"));
    }

    public void delete(int itemNum) {
        if (itemNum >= 0 && itemNum < items.size()) {
            items.removeElementAt(itemNum);
        }
    }

    public void deleteAll() {
        items.removeAllElements();
    }

    public Item get(int itemNum) {
        return (itemNum >= 0 && itemNum < items.size()) ? items.elementAt(itemNum) : null;
    }

    public void set(int itemNum, Item item) {
        if (itemNum >= 0 && itemNum < items.size() && item != null) {
            items.setElementAt(item, itemNum);
        }
    }

    public int size() {
        return items.size();
    }
}
