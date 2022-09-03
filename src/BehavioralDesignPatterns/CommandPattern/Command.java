package BehavioralDesignPatterns.CommandPattern;
/*
this is the shared interface between devices and has two method execute and unExecute
 */
public interface Command {
    void execute();
    void unExecute();
}
