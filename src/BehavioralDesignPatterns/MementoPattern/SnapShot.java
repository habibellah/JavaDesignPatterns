package BehavioralDesignPatterns.MementoPattern;

public class SnapShot {
    private Editor editor;
    private String text;

    public SnapShot(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    public void restore()
    {
        editor.setText(text);
    }
}
