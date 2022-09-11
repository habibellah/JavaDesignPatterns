package BehavioralDesignPatterns.StrategyPattern;

public class Multiplication implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
