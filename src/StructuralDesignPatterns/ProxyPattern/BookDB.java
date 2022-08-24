package StructuralDesignPatterns.ProxyPattern;
//this is the original class of getting book info we consider it as a massive class use big resources, so we use proxy
import java.util.ArrayList;

public class BookDB implements IBook{

  ArrayList<Book> listOfBooks = BookList.getListOfBooks();

    @Override
    public int getNumberOfPagesOfBook(String nameOfBook) {
        for (Book listOfBook : listOfBooks) {
            if (listOfBook.getName().equals(nameOfBook)) {
                return listOfBook.getNumberOfPages();
            }
        }
        return 0;
    }
}
