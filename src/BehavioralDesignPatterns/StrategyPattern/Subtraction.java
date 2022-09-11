package BehavioralDesignPatterns.StrategyPattern;

public class Subtraction implements Strategy{

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
