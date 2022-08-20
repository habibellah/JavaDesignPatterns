package StructuralDesignPatterns.FlyweightPattern;
/*
this programme who implements the flyweight pattern get a Product and then take its Discount
using factory there are two types of discounts of day and of the month and their we implement the flyweight
when the programme do not need to make a new object of one of the discounts if there are exist before
 */
public class User {
    public static void main(String[] args) {
    float clothesPrice = 500.0f;
    IDiscount discount = DiscountFactory.getDiscountFactory("month");
    System.out.println("discount value is :"+discount.discountValue() * clothesPrice);
    }
}
