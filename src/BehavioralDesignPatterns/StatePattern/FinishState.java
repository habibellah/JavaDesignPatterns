package BehavioralDesignPatterns.StatePattern;
//third state(concrete class of states)
public class FinishState implements RunState{
    Context context;

    public void setContext(Context context)
    {
        this.context = context;
    }
    @Override
    public void explainState() {
        System.out.println("i finished");
    }
}
