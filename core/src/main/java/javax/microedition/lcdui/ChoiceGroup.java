package javax.microedition.lcdui;

import java.util.Vector;

public class ChoiceGroup extends Item implements Choice {
    private final int choiceType;
    private final Vector<String> strings = new Vector<>();
    private final Vector<Image> images = new Vector<>();
    private final Vector<Boolean> selected = new Vector<>();

    public ChoiceGroup(String label, int choiceType) {
        super(label);
        this.choiceType = choiceType;
    }

    public ChoiceGroup(String label, int choiceType, String[] stringElements, Image[] imageElements) {
        super(label);
        this.choiceType = choiceType;
        if (stringElements != null) {
            for (int i = 0; i < stringElements.length; i++) {
                Image img = (imageElements != null && i < imageElements.length) ? imageElements[i] : null;
                append(stringElements[i], img);
            }
        }
    }

    @Override
    public int append(String stringPart, Image imagePart) {
        strings.addElement(stringPart != null ? stringPart : "");
        images.addElement(imagePart);
        selected.addElement(false);
        return strings.size() - 1;
    }

    @Override
    public int size() {
        return strings.size();
    }

    @Override
    public String getString(int elementNum) {
        return (elementNum >= 0 && elementNum < strings.size()) ? strings.elementAt(elementNum) : "";
    }

    @Override
    public Image getImage(int elementNum) {
        return (elementNum >= 0 && elementNum < images.size()) ? images.elementAt(elementNum) : null;
    }

    @Override
    public int getSelectedIndex() {
        for (int i = 0; i < selected.size(); i++) {
            if (selected.elementAt(i)) return i;
        }
        return selected.isEmpty() ? -1 : 0;
    }

    @Override
    public void setSelectedIndex(int elementNum, boolean isSelected) {
        if (elementNum >= 0 && elementNum < selected.size()) {
            if (choiceType == EXCLUSIVE && isSelected) {
                for (int i = 0; i < selected.size(); i++) {
                    selected.setElementAt(false, i);
                }
            }
            selected.setElementAt(isSelected, elementNum);
        }
    }

    @Override
    public boolean isSelected(int elementNum) {
        return (elementNum >= 0 && elementNum < selected.size()) && selected.elementAt(elementNum);
    }

    @Override
    public int getSelectedFlags(boolean[] selectedArray_return) {
        if (selectedArray_return == null) return 0;
        int count = 0;
        for (int i = 0; i < selectedArray_return.length && i < selected.size(); i++) {
            boolean b = selected.elementAt(i);
            selectedArray_return[i] = b;
            if (b) count++;
        }
        return count;
    }

    @Override
    public void setSelectedFlags(boolean[] selectedArray) {
        if (selectedArray == null) return;
        for (int i = 0; i < selectedArray.length && i < selected.size(); i++) {
            selected.setElementAt(selectedArray[i], i);
        }
    }
}
