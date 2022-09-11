package BehavioralDesignPatterns.StrategyPattern;

public class Addition implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
