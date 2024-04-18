package Exo3;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    public List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
}
