package BehavioralDesignPatterns.StrategyPattern;


/*
this program will take two numbers and the operation and implement the strategy pattern,
to choose the right operation
 */
public class User {
    public static void main(String[] args) {

        Context context = new Context();

        Strategy addition = new Addition();

        context.setStrategy(addition);
       int result = context.executeStrategyOperation(4,3);
       System.out.println(result);

       //other strategies
        Strategy division = new Division();
        context.setStrategy(division);
        int result2 = context.executeStrategyOperation(5,5);
        System.out.println(result2);
    }
}
