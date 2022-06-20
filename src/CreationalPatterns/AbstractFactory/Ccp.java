package CreationalPatterns.AbstractFactory;
//this class is the concrete class of pay with Ccp
public class Ccp implements PaymentWay{
    @Override
    public void pay() {
        System.out.println("you will pay using Ccp");
    }
}
