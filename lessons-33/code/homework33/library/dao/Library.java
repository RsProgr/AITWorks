package homework33.library.dao;

import homework33.library.model.Book;

public interface Library {
    boolean addBook(Book book);

    Book removeBook(long isbn);

    Book findBook(long isbn);

    int quantity();

    void printBook();
}