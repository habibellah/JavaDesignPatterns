package BehavioralDesignPatterns.StatePattern;

/*
this program implement the state pattern by there is a person will run ,so he has three state
first ready second running third done or finish running
 */
public class User {


    public static void main(String[] args) {
        ReadyState readyState = new ReadyState();
        RunningState runningState = new RunningState();
        FinishState finishState = new FinishState();


        Context context = new Context(readyState);
        context.explainCurrentState();
        //the concrete class itself can change state by using a context object
        readyState.setContext(context);
        readyState.context.changeState(runningState);
        context.explainCurrentState();
        runningState.setContext(context);
        runningState.context.changeState(finishState);
        context.explainCurrentState();

    }
}
