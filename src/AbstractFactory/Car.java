package AbstractFactory;
//this class is the concrete class of buy a Car
public class Car implements VehiclesBuy{
    @Override
    public void buy() {
System.out.println("you buy a Car");
    }
}
