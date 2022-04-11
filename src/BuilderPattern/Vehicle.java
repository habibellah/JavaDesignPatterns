package BuilderPattern;
//Vehicle class we can call by the helper class it has the ability to add the pieces
//in an array list and show it just to understand the concept of builder Pattern
import java.util.ArrayList;

public class Vehicle {


    private final ArrayList<String> plus ;
    public Vehicle()
    {
        plus = new ArrayList<>();
    }
    public void addPieces(String pieces)
    {
        plus.add(pieces);
    }
    public void show()
    {
        for (String s : plus) {
            System.out.println(s);
        }
    }
}
