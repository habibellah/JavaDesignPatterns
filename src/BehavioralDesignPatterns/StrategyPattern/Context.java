package BehavioralDesignPatterns.StrategyPattern;

public class Context {
    Strategy strategy;

    void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    int executeStrategyOperation(int a ,int b)
    {
        return  strategy.execute(a,b);
    }
}
