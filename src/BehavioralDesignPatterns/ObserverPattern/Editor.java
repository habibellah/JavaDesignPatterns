package BehavioralDesignPatterns.ObserverPattern;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Editor {
 ArrayList<SubscriberEventListener> subscribers = new ArrayList<>();



 public void subscribe(SubscriberEventListener subscriber)
 {
     subscribers.add(subscriber);
 }

 public void unsubscribe(SubscriberEventListener subscriber)
 {
     subscribers.remove(subscriber);
 }


 public void notified(File file)
 {

     for(int i = 0 ; i < subscribers.size() ; i++)
     {
        subscribers.get(i).update(file.getText());
     }
 }

 public void setNewFileInfo(File file)
 {
     file.setText("new text added on file 1");
     notified(file);
 }

}
