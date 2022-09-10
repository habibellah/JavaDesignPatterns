package BehavioralDesignPatterns.StatePattern;
/*
this class it is the responsible ,of changing states over time
 */
public class Context {
    RunState runState;

    public Context(RunState runState) {
        this.runState = runState;
    }

    public void changeState(RunState state)
    {
        this.runState = state;
    }

    public void explainCurrentState()
    {
        this.runState.explainState();
    }
}
