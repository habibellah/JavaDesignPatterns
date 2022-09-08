package BehavioralDesignPatterns.MementoPattern;
/*
this program is about text editor we implement the memento pattern to use the undo or restore last
command
 */
public class Editor {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SnapShot createSnapShot()
    {
        return new SnapShot(this,text);
    }
}
