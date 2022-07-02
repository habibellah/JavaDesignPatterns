package StructuralDesignPatterns.BridgePattern;
//Circle class extends shape class and implement the drawShape method with its properties and color
public class Circle extends Shape{
    public Circle(IColor color) {
        super(color);
    }

    @Override
    public void drawShape() {
System.out.println("iam a Circle with "+super.color.colored()+" color");
    }
}
