package BehavioralDesignPatterns.ChainOfResponsibility;
//concrete class of handler the add operation
public class Addition implements OperationsHandler{

    OperationsHandler nextHandler;

    @Override
    public void calculate(Request request) {
     if(request.operation == '+')
     {
         System.out.println("addition :"+(request.numberOne + request.numberTwo));
     }else {
         nextHandler.calculate(request);
     }
    }

    @Override
    public void nextHandler(OperationsHandler operationsHandler) {
    this.nextHandler = operationsHandler;
    }
}
