package BehavioralDesignPatterns.ChainOfResponsibility;
//this class has the two numbers and the type of operation
public class Request {
    int numberOne;
    int numberTwo;
    char operation;

    public Request(int numberOne, int numberTwo, char operation) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.operation = operation;
    }
}
