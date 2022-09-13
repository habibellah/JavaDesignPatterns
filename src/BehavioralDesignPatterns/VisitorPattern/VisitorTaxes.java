package BehavioralDesignPatterns.VisitorPattern;
//concrete class of visitor who will add taxes if you want to add
//other functionality just new class implement the visitor
public class VisitorTaxes implements Visitor{
    @Override
    public void visit(Apple apple) {
    apple.setPrice(apple.getPrice() * 1.2);
    }

    @Override
    public void visit(Car car) {
        car.setPrice(car.getPrice() * 1.5);
    }
}
