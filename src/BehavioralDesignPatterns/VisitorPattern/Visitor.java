package BehavioralDesignPatterns.VisitorPattern;
//visitor has multiple product who will visit this to avoid conditions
public interface Visitor {
    void visit(Apple apple);
    void visit(Car car);
}
