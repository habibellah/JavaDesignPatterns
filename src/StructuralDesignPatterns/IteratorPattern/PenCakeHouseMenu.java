package StructuralDesignPatterns.IteratorPattern;

import java.util.ArrayList;
/*
this class calls the iterator methods from the concrete with a special code the iterator will loop all items
on the menu
 */
public class PenCakeHouseMenu {
    ArrayList<Object> menuItems;

    public PenCakeHouseMenu(){
        menuItems = new ArrayList<>();
        addItem("ice cream","it is an ice food",true,3.3);
        addItem("pen cake","it is for break fast",true,5.3);
        addItem("wafel","it is a sandwich of some ingredients",true,2.2);
        addItem("nescaffe" ,"it is special coffee",true,3.1);
        addItem("Milk with bread","it is  food",true,3.0);
        addItem("Pizza","it is  food",false,4.2);
    }

    public void addItem(String name ,String description ,boolean vegetarian ,double price)
    {
        MenuItems menuItem = new MenuItems(name,description,vegetarian,price);
       menuItems.add(menuItem);
    }

    Iterator getIterator(){
        return new ArrayListIterator(menuItems);
    }

}
