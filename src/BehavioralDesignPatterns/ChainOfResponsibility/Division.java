package BehavioralDesignPatterns.ChainOfResponsibility;
//concrete class of handler the div operation
public class Division  implements OperationsHandler{

    OperationsHandler nextHandler;

    @Override
    public void calculate(Request request) {
        if(request.operation == '/')
        {
            System.out.println("division :"+request.numberOne / request.numberTwo);
        }else {
            System.out.println("we do not support this operation");
        }
    }

    @Override
    public void nextHandler(OperationsHandler operationsHandler) {
        this.nextHandler = operationsHandler;
    }
}
