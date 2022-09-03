package BehavioralDesignPatterns.CommandPattern;

/*
this program is about a remote control and the light of the room we implemented the command pattern
when the user click in on button in the remote the light will be on and off will be off
 */
public class User {
    public static void main(String[] args) {
        Light light = new Light();

        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        Remote remote = new Remote(onCommand, offCommand);

        remote.onButtonClick();
        remote.offButtonClick();
        remote.undoButton();
    }
}
