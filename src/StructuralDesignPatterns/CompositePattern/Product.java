package StructuralDesignPatterns.CompositePattern;
//product class implement ProductPrice interface the method show the price and the name of the product
public class Product implements ProductPrice{
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showProductPrice() {
        System.out.println("the product is "+name+" the price is "+price);
    }
}
