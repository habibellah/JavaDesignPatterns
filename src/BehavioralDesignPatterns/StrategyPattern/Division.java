package BehavioralDesignPatterns.StrategyPattern;

public class Division implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
