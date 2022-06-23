package CreationalPatterns.AbstractFactory;
/*
here the implementation of IAbstractFactory who is responsible of return many products
in a condition (getVehicleBuy)to return one object of concrete classes who implement VehiclesBuy interface
(getPaymentWay)o return one object of concrete classes who implement PaymentWay interface.
 */
public class AbstractController implements IAbstractFactory{
    @Override
    public VehiclesBuy getVehicleBuy(String vehicle) {
        return switch (vehicle) {
            case "Car" -> new Car();
            case "Truck" -> new Truck();
            case "MotorCycle" -> new MotorCycle();
            default -> null;
        };
    }

    @Override
    public PaymentWay getPaymentWay(String payment) {
        return switch (payment) {
            case "Ccp" -> new Ccp();
            case "Visa" -> new Visa();
            case "Paysera" -> new Paysera();
            default -> null;
        };
    }
}
