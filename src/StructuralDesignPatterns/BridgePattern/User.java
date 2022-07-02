package StructuralDesignPatterns.BridgePattern;
/*
this example is a programme of drawing Shaped with a different Colors
using Bridge Pattern
 */
public class User {
    public static void main(String[] args) {
Yellow yellow = new Yellow();
Green green = new Green();
Square square = new Square(yellow);
Square square1 = new Square(green);
Circle circle = new Circle(green);
square.drawShape();
square1.drawShape();
circle.drawShape();
    }
}
