package BehavioralDesignPatterns.IteratorPattern;
/*
this class is responsible to show the two menus using iterator and do not care
what is the collection use in witch menu come
 */
public class Waitress {
    DinnerMenu dinnerMenu;
    PenCakeHouseMenu penCakeHouseMenu;

    public Waitress(DinnerMenu dinnerMenu, PenCakeHouseMenu penCakeHouseMenu) {
        this.dinnerMenu = dinnerMenu;
        this.penCakeHouseMenu = penCakeHouseMenu;
    }

    public void printMenu()
    {
        Iterator dinner = dinnerMenu.getIterator();
        Iterator penCake = penCakeHouseMenu.getIterator();
        printMenu(dinner);
        printMenu(penCake);
    }

    private void printMenu(Iterator iterator)
    {
        while (iterator.hasNext())
        {
            System.out.println(((MenuItems)iterator.next()).name );
        }
    }
}
