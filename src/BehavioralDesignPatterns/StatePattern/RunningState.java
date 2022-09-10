package BehavioralDesignPatterns.StatePattern;
//second state(concrete class of states)
public class RunningState implements RunState{
    Context context;

    public void setContext(Context context)
    {
        this.context = context;

    }
    @Override
    public void explainState() {
        System.out.println("iam running");
    }
}
