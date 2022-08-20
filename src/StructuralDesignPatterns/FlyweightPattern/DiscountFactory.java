package StructuralDesignPatterns.FlyweightPattern;

import java.util.HashMap;
/*
here we implement two patterns almost time the fly weight pattern come with factory method
we made a hashMap like a small memory in our programme we store in it types of the discounts
if the user already take it and here is the flyweight
 */
public class DiscountFactory {

    private static final HashMap<String, IDiscount> discounts = new HashMap<>();
  private static IDiscount discountTime = null;
    public static IDiscount getDiscountFactory(String discountType) {

        if (discounts.containsKey(discountType)) {
            return discounts.get(discountType);
        } else {
             switch (discountType) {
                 case "day" -> {
                     discountTime = new DayDiscount();
                     discounts.put(discountType,discountTime);
                 }
                 case "month" -> {
                     discountTime = new MonthDiscount();
                     discounts.put(discountType,discountTime);
                 }
             }
             return discountTime;
        }

    }
}
