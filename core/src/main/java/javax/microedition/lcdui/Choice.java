package javax.microedition.lcdui;

public interface Choice {
    int EXCLUSIVE = 1;
    int MULTIPLE = 2;
    int IMPLICIT = 3;
    int POPUP = 4;

    int append(String stringPart, Image imagePart);
    int size();
    String getString(int elementNum);
    Image getImage(int elementNum);
    int getSelectedIndex();
    void setSelectedIndex(int elementNum, boolean selected);
    boolean isSelected(int elementNum);
    int getSelectedFlags(boolean[] selectedArray_return);
    void setSelectedFlags(boolean[] selectedArray);
}
