package BehavioralDesignPatterns.VisitorPattern;

public class Car implements Visitable{

    double price;

    public Car(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
}
