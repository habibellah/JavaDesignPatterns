package CreationalPatterns.AbstractFactory;
//this class is the concrete class of buy a Truck
public class Truck implements VehiclesBuy{
    @Override
    public void buy() {
        System.out.println("you buy a Truck");
    }
}
