package StructuralDesignPatterns.FacadePattern;
/*
this programme implement the facade pattern by using ShapeMakerFacade and with it the class does not
depend on many classes 
 */
public class User {
    public static void main(String[] args) {
        ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();
        shapeMakerFacade.drawCircle();
        shapeMakerFacade.drawRectangle();
        shapeMakerFacade.drawSquare();
    }
}
