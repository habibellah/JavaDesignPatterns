package BehavioralDesignPatterns.IteratorPattern;
/*
this class calls the iterator methods from the concrete with a special code the iterator will loop all items
on the menu
 */
public class DinnerMenu {
    static final int MAX_LENGTH = 6;
    int numberOfItems = 0;
    MenuItems [] menuItems;

    public DinnerMenu(){
        menuItems = new MenuItems[MAX_LENGTH];
        addItem("kouskous","it is an algerian food",true,3.3);
        addItem("shakhshouks","it is an Mesila food it is very hot",true,5.3);
        addItem("burgur","it is a sandwich of some ingredients",false,2.2);
        addItem("hot dog","with onions and meat and lotus",false,3.1);
        addItem("Rice","it is  food",true,3.0);
        addItem("water melon with meat","it is  food",false,4.2);
    }

    public void addItem(String name ,String description ,boolean vegetarian ,double price)
    {
        MenuItems menuItem = new MenuItems(name,description,vegetarian,price);
        if (MAX_LENGTH <= numberOfItems)
        {
            System.out.println("sorry the menu is full");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    Iterator getIterator()
    {
        return new ArrayIterator(menuItems);
    }

}
