package BehavioralDesignPatterns.ObserverPattern;

public class File {
    private String text;

    public File(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
