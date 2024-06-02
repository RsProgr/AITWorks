package homework31.library.tests;

import homework31.library.dao.Library;
import homework31.library.dao.LibraryImpl;
import homework31.library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book[] book;

    @BeforeEach
    public void setUp() {
        library = new LibraryImpl(4);
        book = new Book[4];
        book[0] = new Book("Kazuo Ishiguro", 2021, 9780593318171L, "Klara and the Sun");
        book[1] = new Book("Andy Weir", 2021, 9780593135204L, "Project Hail Mary");
        book[2] = new Book("Taylor Jenkins Reid", 2021, 9781524798642L, "Malibu Rising");
        book[3] = new Book("Colleen Hoover", 2022, 9781542025607L, "Reminders of Him");
    }

    @Test
    void addBook() {
        assertFalse(library.addBook(null)); // Typically adding null should return false
        assertTrue(library.addBook(book[1]));
        assertFalse(library.addBook(book[1])); // Adding the same book again should fail
        Book book1 = new Book("autor5", 1254, 451269745612L, "ab");
        assertTrue(library.addBook(book1));
        assertEquals(2, library.quantity());

        Book book2 = new Book("autor6", 1365, 3465347583734L, "ey");
        assertTrue(library.addBook(book2)); // Added another book
        assertFalse(library.addBook(book[0])); // Library capacity is full now
    }

    @Test
    void removeBook() {
        library.addBook(book[1]);
        Book removedBook = library.removeBook(book[1].getIsbn());
        assertEquals(book[1], removedBook);
        assertNull(library.findBook(book[1].getIsbn()));
        assertEquals(0, library.quantity());
    }

    @Test
    void findBook() {
        library.addBook(book[1]);
        library.addBook(book[2]);
        assertEquals(book[1], library.findBook(book[1].getIsbn()));
        assertEquals(book[2], library.findBook(book[2].getIsbn()));
        assertNull(library.findBook(book[3].getIsbn()));
    }

    @Test
    void quantity() {
        assertEquals(0, library.quantity());
        library.addBook(book[1]);
        assertEquals(1, library.quantity());
        library.addBook(book[2]);
        assertEquals(2, library.quantity());
    }

    @Test
    void printBook() {
        library.addBook(book[1]);
        library.addBook(book[2]);
        library.printBook();
    }

    @Test
    void testAddBook() {
        //нельзя добавить null
        assertFalse(library.addBook(null));
        //нельзя добавить второй раз уже имеющуюся книгу
        assertTrue(library.addBook(book[1]));
        //добавляем книгу
        Book book = new Book("George Orwell", 1949, 9780452284234L, "1984");
        assertTrue(library.addBook(book));
        //проверяем количество после добавления
        assertEquals(2,library.quantity());
        //нельзя превысить capacity
        Book bookOneMore = new Book("Jane Austen", 1813, 9780141439518L, "Pride and Prejudice");
        assertTrue(library.addBook(bookOneMore));

        library.printBook();


    }

  //

    @Test
    void testFindBook() {
    }

    @Test
    void testQuantity() {
    }

    @Test
    void testPrintBook() {
    }

    @Test
    void testAddBook1() {
    }

    @Test
    void testRemoveBook1() {
    }

    @Test
    void testFindBook1() {
    }

    @Test
    void testQuantity1() {
    }

    @Test
    void testPrintBook1() {
    }
}