package Exo3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean isBookAvailable(Book book) {
        return books.contains(book);
    }

    public void borrowBook(Book book, User user) {
        if (isBookAvailable(book)) {
            user.borrowBook(book);
            books.remove(book);
            System.out.println("Le livre \"" + book.title + "\" a été emprunté par " + user.name + ".");
        } else {
            System.out.println("Le livre \"" + book.title + "\" n'est pas disponible dans la bibliothèque.");
        }
    }
}

