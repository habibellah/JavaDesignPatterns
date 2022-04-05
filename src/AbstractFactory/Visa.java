package AbstractFactory;
//this class is the concrete class of pay with Visa
public class Visa implements PaymentWay{
    @Override
    public void pay() {
        System.out.println("you will pay using Visa");
    }
}
