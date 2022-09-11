package BehavioralDesignPatterns.IteratorPattern;
//the properties of the menu in every restaurant
public class MenuItems {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItems(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
}
