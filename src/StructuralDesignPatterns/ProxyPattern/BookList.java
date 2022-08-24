package StructuralDesignPatterns.ProxyPattern;
//this class like a db get from it the data it is books
import java.util.ArrayList;

public class BookList {
    public static ArrayList<Book> getListOfBooks()
    {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("clean code",400));
        listOfBooks.add(new Book("clean architecture",500));
        listOfBooks.add(new Book("steal like an artist",190));
return listOfBooks;
    }
}
