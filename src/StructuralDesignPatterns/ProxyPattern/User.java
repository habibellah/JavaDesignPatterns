package StructuralDesignPatterns.ProxyPattern;
/*
in this program with put a name of a book and get its number of pages,
and we implement it using proxy design pattern
 */
public class User {
    public static void main(String[] args) {
 ProxyBook proxyBook = new ProxyBook();
        System.out.println( proxyBook.getNumberOfPagesOfBook("steal like an artist"));
        System.out.println( proxyBook.getNumberOfPagesOfBook("clean code"));
    }
}
