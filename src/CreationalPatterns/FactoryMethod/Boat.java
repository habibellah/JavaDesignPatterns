package CreationalPatterns.FactoryMethod;
//this class is one of the concrete class who implement the interface of transport vehicle of your trip and this class define the Boat
public class Boat implements TransportTrip{
    @Override
    public void transportWay() {
 System.out.println("you will use a boat for your trip");
    }
}
