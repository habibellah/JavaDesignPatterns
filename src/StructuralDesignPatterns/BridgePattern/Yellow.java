package StructuralDesignPatterns.BridgePattern;
//this is the yellow color who implement IColor interface will colored the shape with yellow
public class Yellow implements IColor{
    @Override
    public String colored() {
        return "Yellow";
    }
}
