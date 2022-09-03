package BehavioralDesignPatterns.CommandPattern;
//Light class has two method turn on the light and turn off it is the Receiver
public class Light {
    public void turnON()
    {
        System.out.println("the light is ON");
    }

    public void turnOff()
    {
        System.out.println("the light is OFF");
    }
}
