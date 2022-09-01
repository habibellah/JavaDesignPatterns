package BehavioralDesignPatterns.ChainOfResponsibility;
//concrete class of handler the sub operation
public class Subtraction  implements OperationsHandler{

    OperationsHandler nextHandler;

    @Override
    public void calculate(Request request) {
        if(request.operation == '-')
        {
            System.out.println("subtraction :"+ (request.numberOne - request.numberTwo));
        }else {
            nextHandler.calculate(request);
        }
    }

    @Override
    public void nextHandler(OperationsHandler operationsHandler) {
        this.nextHandler = operationsHandler;
    }
}
