package homework33.library.tests;

import homework33.library.dao.Library;
import homework33.library.dao.LibraryImpl;
import homework33.library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static classwork.ArrayAppl.printArray;
import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book[] book;

    @BeforeEach
    public void setUp() {
        library = new LibraryImpl(4);
        book = new Book[4];
        book[0] = new Book("Kazuo Ishiguro", 1965, 9780593318171L, "Klara and the Sun");
        book[1] = new Book("Andy Weir", 2015, 9780593135204L, "Project Hail Mary");
        book[2] = new Book("Taylor Jenkins Reid", 1989, 9781524798642L, "Malibu Rising");
        book[3] = new Book("Colleen Hoover", 2023, 9781542025607L, "Reminders of Him");
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
    void testBookComparator() {
        Comparator<Book> bookComparator = new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        };
        System.out.println("==========test book sorting by comparator===========");
        printBook();
        System.out.println("=======================================================");
        Arrays.sort(book , bookComparator);
        printBook();
    }
    @Test
    void testBookComparator2() {
        Comparator<Book> bookComparator = new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getInYear() - (o2.getInYear());
            }
        };
        System.out.println("==========test book sorting by comparator===========");

        System.out.println("=======================================================");
        Arrays.sort(book , bookComparator);
       printBook();
    }
}