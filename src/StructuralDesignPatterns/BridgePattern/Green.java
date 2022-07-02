package StructuralDesignPatterns.BridgePattern;
//this is the green color who implement IColor interface will colored the shape with green
public class Green implements IColor{
    @Override
    public String colored() {
        return "Green";
    }
}
