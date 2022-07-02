package StructuralDesignPatterns.BridgePattern;
//Square class extends shape class and implement the drawShape method with its properties and color
public class Square extends Shape{
    public Square(IColor color) {
        super(color);
    }

    @Override
    public void drawShape() {
        System.out.println("iam a Square with "+super.color.colored()+" color");
    }
}
