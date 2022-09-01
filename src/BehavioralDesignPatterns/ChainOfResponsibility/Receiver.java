package BehavioralDesignPatterns.ChainOfResponsibility;
//this class control all handlers and which handler will start with and its init
public class Receiver {
   private final OperationsHandler add = new Addition();
    private final OperationsHandler sub = new Subtraction();
    private final OperationsHandler mul = new Multiplication();
    private final OperationsHandler div = new Division();

    public Receiver()
    {
        add.nextHandler(sub);
        sub.nextHandler(mul);
        mul.nextHandler(div);
    }

    public void sendRequest(Request request)
    {
        add.calculate(request);
    }
}
