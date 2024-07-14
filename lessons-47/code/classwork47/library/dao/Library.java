package classwork47.library.dao;

import classwork47.library.model.Author;
import classwork47.library.model.Book;

public interface Library {

    boolean addBook(Book book);
    Book findBookByAuthor(Author author);
    Book findBookByIsbn(String isbn);
    boolean rentBook(String isbn);
    boolean getBackBook(String isbn);
    int quantity();
    // save
    // load
    // print all books

}