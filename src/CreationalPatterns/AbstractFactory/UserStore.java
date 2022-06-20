package CreationalPatterns.AbstractFactory;
/*
this package has the abstract factory pattern and in our example
we make a programme of buying vehicles ,and we have more than one payment way
,so we use the abstract pattern because we need to return more than one product
 */
public class UserStore {
    public static void main(String[] args) {
        AbstractController abstractController = new AbstractController();
        PaymentWay paymentWay = abstractController.getPaymentWay("Visa");
        VehiclesBuy vehiclesBuy = abstractController.getVehicleBuy("Car");
        vehiclesBuy.buy();
        paymentWay.pay();
    }
}
