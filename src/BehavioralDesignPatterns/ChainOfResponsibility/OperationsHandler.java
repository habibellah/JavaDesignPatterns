package BehavioralDesignPatterns.ChainOfResponsibility;
//this interface has two methods calculate or pass to the next handler
public interface OperationsHandler {
    void calculate(Request request);
    void nextHandler(OperationsHandler operationsHandler);
}
