package StructuralDesignPatterns.ProxyPattern;
//the book class has information of book name and number of pages
public class Book {
    private final String name;
    private final int numberOfPages;
    public Book(String name,int numberOfPages)
    {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

}
