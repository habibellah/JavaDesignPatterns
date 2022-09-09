package BehavioralDesignPatterns.ObserverPattern;

public class EmailListener implements SubscriberEventListener{
    File file;

    public EmailListener(File file) {
        this.file = file;
    }

    @Override
    public void update(String event) {
  System.out.println("i know that there is changes it is "+event);
    }
}
