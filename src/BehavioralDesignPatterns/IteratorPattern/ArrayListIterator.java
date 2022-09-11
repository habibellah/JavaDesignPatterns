package BehavioralDesignPatterns.IteratorPattern;

import java.util.ArrayList;
/*
concrete class of iterator implement its methods with a special code the iterator loop all items
on the menu this concrete class to use iterator with arrayList collections
 */
public class ArrayListIterator implements Iterator{

  private   ArrayList<Object> myArrayList;
    private int position = 0;

    public ArrayListIterator(ArrayList<Object> myArrayList)
    {
        this.myArrayList = myArrayList;
    }

    @Override
    public Boolean hasNext() {
        return position < myArrayList.size();
    }

    @Override
    public Object next() {
        Object temp = myArrayList.get(position);
        position++;
        return temp;
    }
}
