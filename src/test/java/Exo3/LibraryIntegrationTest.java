package Exo3;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryIntegrationTest {

    @Test
    public void testBorrowBook() {
        // Création de la bibliothèque
        Library library = new Library();

        // Création d'un livre disponible dans la bibliothèque
        Book book = new Book("Book 1", "Author 1");
        library.addBook(book);

        // Création d'un utilisateur
        User user = new User("User 1");

        // Emprunt du livre par l'utilisateur
        library.borrowBook(book, user);

        // Vérification si le livre a été emprunté par l'utilisateur
        assertTrue(user.borrowedBooks.contains(book));

        // Vérification si le livre a été retiré de la bibliothèque
        assertFalse(library.isBookAvailable(book));
    }
}