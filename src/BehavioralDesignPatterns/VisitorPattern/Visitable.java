package BehavioralDesignPatterns.VisitorPattern;
//the visitable will implement by the products who will get to accept to add taxes
public interface Visitable {
    void accept(Visitor visitor);
}
