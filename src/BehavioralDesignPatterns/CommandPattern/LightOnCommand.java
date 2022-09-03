package BehavioralDesignPatterns.CommandPattern;
//this is the concrete class of command where we will implement its methods by execute(on) and unExecute(off)
public class LightOnCommand implements Command{

    Light light;
    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute() {
      light.turnON();
    }

    @Override
    public void unExecute() {
      light.turnOff();
    }
}
