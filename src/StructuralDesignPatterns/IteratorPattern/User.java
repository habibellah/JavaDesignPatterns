package StructuralDesignPatterns.IteratorPattern;

/*
this program implement the iterator pattern because there two restaurant want to be one but one of them
the menu is built using array and the another built using array list
 */
public class User {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        PenCakeHouseMenu penCakeHouseMenu = new PenCakeHouseMenu();

        Waitress waitress = new Waitress(dinnerMenu,penCakeHouseMenu);
        waitress.printMenu();
    }
}
