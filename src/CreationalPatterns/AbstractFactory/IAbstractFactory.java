package CreationalPatterns.AbstractFactory;
/*
this interface is the main interface and the power of abstract pattern who has the methods who can
return many products in our case will return a product of vehicle and the payment way
 */
public interface IAbstractFactory {
    VehiclesBuy getVehicleBuy(String vehicle);
    PaymentWay getPaymentWay(String payment);
}
