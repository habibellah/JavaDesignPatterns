package BehavioralDesignPatterns.VisitorPattern;
/*
in this program we implement the visitor pattern by adding a new functionality it is taxes
 */
public class User {
    public static void main(String[] args) {
        Car car = new Car(300.300);
        Apple apple = new Apple(10.20);
        Visitor visitor = new VisitorTaxes();

        System.out.println("price of car before taxes is "+car.getPrice());
        visitor.visit(car);
        System.out.println("price of car after taxes is "+car.getPrice());


        System.out.println("price of apple before taxes is "+apple.getPrice());
        visitor.visit(apple);
        System.out.println("price of apple after taxes is "+apple.getPrice());

    }
}
