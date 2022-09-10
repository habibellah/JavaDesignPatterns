package BehavioralDesignPatterns.StatePattern;
//first state(concrete class of states)
public class ReadyState implements RunState{
    Context context;

    public void setContext(Context context)
    {
        this.context = context;

    }
    @Override
    public void explainState() {
System.out.println("iam ready to run");
    }
}
