package BehavioralDesignPatterns.MediatorPattern;
//the parent class of all component
public class Component {
    protected IMediator iMediator;

    public Component(IMediator iMediator) {
        this.iMediator = iMediator;
    }

}
