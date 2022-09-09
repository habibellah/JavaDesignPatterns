package BehavioralDesignPatterns.ObserverPattern;
/*
this program implement observer Pattern by use an textEditor when any file changes its state
,other concrete classes will be notified about changes
 */
public class User {
    public static void main(String[] args) {
        File file1 = new File("this is file 1");

        Editor editor = new Editor();

        EmailListener emailListener = new EmailListener(file1);

        editor.subscribe(emailListener);
        editor.setNewFileInfo(file1);
    }
}
