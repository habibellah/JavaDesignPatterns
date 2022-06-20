package CreationalPatterns.FactoryMethod;
//this class define the factory method getFactoryVehicle return object
// for one of the concrete classes of vehicle you use in your trip
public class Factory {

    public TransportTrip getFactoryVehicle(String vehicle)
    {
        return switch (vehicle) {
            case "Car" -> new Car();
            case "Boat" -> new Boat();
            case "AeroPlane" -> new AeroPlane();
            default -> null;
        };
    }
}
