package CreationalPatterns.FactoryMethod;
//this class is one of the concrete class who implement the interface of transport vehicle
// of your trip and this class define the Aero Plane
public class AeroPlane implements TransportTrip{
    @Override
    public void transportWay() {
        System.out.println("you will use an aeroplane for your trip");
    }
}
