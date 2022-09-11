package BehavioralDesignPatterns.IteratorPattern;
/*
concrete class of iterator implement its methods with a special code the iterator loop all items
on the menu this concrete class to use iterator with array collections
 */
public class ArrayIterator implements Iterator{

   private Object []array;
    private int position = 0;


    public ArrayIterator(Object []array)
    {
        this.array = array;
    }

    @Override
    public Boolean hasNext() {
        return position < array.length;
    }

    @Override
    public Object next() {
        Object temp = array[position];
        position++;
        return temp;
    }
}
