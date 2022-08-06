package StructuralDesignPatterns.FacadePattern;

//facade class to hide framework complexity by made all dependencies of what user need of classes
public class ShapeMakerFacade {
    private final Circle circle;
    private final Rectangle rectangle;
    private final Square square;
    public ShapeMakerFacade()
    {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle()
    {
        circle.draw();
    }
    public void drawRectangle()
    {
        rectangle.draw();
    }

    public void drawSquare()
    {
        square.draw();
    }


}
