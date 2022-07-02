package StructuralDesignPatterns.CompositePattern;
/*
this example is a programme to show price and name of products
why we use composite pattern because the products here is inside boxes
,and maybe we can find a box inside a box ,so we use it
 */
public class User {
    public static void main(String[] args) {
        Product p1 = new Product("laptop",4000);
        Product p2 = new Product("Ram",40);
        Box b1 = new Box();
        b1.addProduct(p1);
        b1.addProduct(p2);

        Product p3 = new Product("book",13);
        Product p4 = new Product("pen",2);
        Box b2 = new Box();
        b2.addProduct(p4);
        b2.addProduct(p3);

        Product p5 = new Product("mobile",2000);
        Box mainBox = new Box();
        mainBox.addProduct(b1);
        mainBox.addProduct(b2);
        mainBox.addProduct(p5);
        mainBox.showProductPrice();
    }
}
