package StructuralDesignPatterns.ProxyPattern;
/*
the proxy book class we implement on it the proxy pattern it is the class who will
communicate with the user and create the book db object only when the user need it
 */
public class ProxyBook implements IBook{
    private BookDB bookDB = null;

    @Override
    public int getNumberOfPagesOfBook(String nameOfBook) {
        if(bookDB == null)
        {
            bookDB = new BookDB();
        }
        return this.bookDB.getNumberOfPagesOfBook(nameOfBook);
    }
}
