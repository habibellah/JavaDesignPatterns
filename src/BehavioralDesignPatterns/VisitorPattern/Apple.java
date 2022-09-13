package BehavioralDesignPatterns.VisitorPattern;

public class Apple implements Visitable{
    double price;

    public Apple(double price) {
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
