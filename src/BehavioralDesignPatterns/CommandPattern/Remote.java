package BehavioralDesignPatterns.CommandPattern;
/*
the remote class has two buttons on and off his job implement to execute and unExecute methods of the command interface
the remote do not know methods of command what does it call the Invoker
 */
public class Remote {
   private final Command onCommand;
   private final Command offCommand;

   private Command undoCommand;
    public Remote(Command onCommand,Command offCommand)
    {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void onButtonClick()
    {
        onCommand.execute();
        this.undoCommand = onCommand;
    }

    public void offButtonClick()
    {
        offCommand.execute();
        this.undoCommand = offCommand;
    }

    public void undoButton()
    {
        this.undoCommand.unExecute();
    }
}
