package BehavioralDesignPatterns.ChainOfResponsibility;
/*
this program implements the chain of responsibility  pattern by get two numbers and type of operation
from the user and then add it to the handler to see if it can handle it or pass it to the next
operation (handler)
 */
public class User {
    public static void main(String[] args) {

        Request request = new Request(3,2,'/');
        Receiver receiver = new Receiver();
        receiver.sendRequest(request);


    }
}
