package StructuralDesignPatterns.FlyweightPattern;
//day discount has 0.25 discount of the real value of the product you take
public class DayDiscount implements IDiscount{
    @Override
    public float discountValue() {
        return 0.25f;
    }
}
