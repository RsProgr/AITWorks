package homework33.library;

import homework33.library.dao.LibraryImpl;
import homework33.library.model.Book;

public class LibraryAppl {
    public static void main(String[] args) {
        LibraryImpl library = new LibraryImpl(5);
        Book[] books = new Book[4] ;
        books[0] = new Book("Kazuo Ishiguro", 2021, 9780593318171L, "Klara and the Sun");
        books[1] = new Book("Andy Weir", 2021, 9780593135204L, "Project Hail Mary");
        books[2] = new Book("Taylor Jenkins Reid", 2021, 9781524798642L, "Malibu Rising");
        books[3] = new Book("Colleen Hoover", 2022, 9781542025607L, "Reminders of Him");
        library.printBook();

    }
}
