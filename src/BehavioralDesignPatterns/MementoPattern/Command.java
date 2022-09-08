package BehavioralDesignPatterns.MementoPattern;

public class Command {

    private SnapShot backUp;
    private Editor editor;

    public void createBackUp()
    {
        this.backUp = editor.createSnapShot();
    }

    public void undo()
    {
        if (backUp != null)
        {
            backUp.restore();
        }
    }
}
