package FactoryMethod;
/*
UserTripPage has the main methode, and we can define it as the user Class where he will choose one of the vehicle in the trip
without create new objects of these classes
 */
public class UserTripPage {

    public static void main(String[] args) {

        Factory factory = new Factory();
        TransportTrip trip = factory.getFactoryVehicle("Boat");
        trip.transportWay();
        //the result is: you will use a car for you trip
    }

}
