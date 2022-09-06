package BehavioralDesignPatterns.MediatorPattern;
//concrete class of component
public class CheckBox extends Component{

    public CheckBox(IMediator iMediator) {
        super(iMediator);
    }

    public void checkBoxChecked()
    {
        iMediator.notifyComponent(this,"the check box is Checked");
    }
}
