package BehavioralDesignPatterns.MediatorPattern;
//this is the concrete class of IMediator where its object make connection with all component to avoid
//coupling between components
public class AuthenticationDialogue implements IMediator{



    public void buttonEvent(String event)
    {
        System.out.println(event);
    }

    public void checkBoxEvent(String event)
    {
        System.out.println(event);
    }

    @Override
    public void notifyComponent(Component component, String event) {
        if (component instanceof Button)
        {
            buttonEvent(event);
        }else if (component instanceof CheckBox)
        {
            checkBoxEvent(event);
        }
    }
}
