package StructuralDesignPatterns.FlyweightPattern;
//month discount has 0.5 discount of the real value of the product you take
public class MonthDiscount implements IDiscount{
    @Override
    public float discountValue() {
        return 0.50f;
    }
}
