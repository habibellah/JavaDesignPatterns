package CreationalPatterns.AbstractFactory;
//this class is the concrete class of buy a motorCycle
public class MotorCycle implements VehiclesBuy{
    @Override
    public void buy() {
        System.out.println("you buy a MotorCycle");
    }
}
