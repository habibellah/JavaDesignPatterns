package AbstractFactory;
//this class is the concrete class of pay with paysera
public class Paysera implements PaymentWay{
    @Override
    public void pay() {
System.out.println("you will pay using Paysera");
    }
}
