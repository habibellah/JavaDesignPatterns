package BehavioralDesignPatterns.CommandPattern;
//this is the concrete class of command where we will implement its methods by execute (off) and unExecute(on)
public class LightOffCommand implements Command{

    Light light;
    public LightOffCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void unExecute() {
        light.turnON();
    }
}
