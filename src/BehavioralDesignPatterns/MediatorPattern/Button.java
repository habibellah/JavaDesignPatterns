package BehavioralDesignPatterns.MediatorPattern;
//concrete class of component
public class Button extends Component{

    public Button(IMediator iMediator) {
        super(iMediator);
    }

    public void buttonClicked()
    {
        iMediator.notifyComponent(this,"the button is clicked");
    }
}
