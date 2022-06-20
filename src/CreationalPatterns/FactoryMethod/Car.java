package CreationalPatterns.FactoryMethod;
//this class is one of the concrete class who implement the interface of transport vehicle of your trip and this class define the car
public class Car implements TransportTrip {
    @Override
    public void transportWay() {
 System.out.println("you will use a Car for your trip");
    }
}
