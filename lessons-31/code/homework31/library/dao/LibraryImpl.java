package homework31.library.dao;

import homework31.library.model.Book;

import java.util.Arrays;

public class LibraryImpl implements Library {
    Book[] book;
    int size;

    public LibraryImpl(int capacity) {
        book = new Book[capacity];
        size = 0;
    }

    @Override
    public boolean addBook(Book book) {
        if (size + 1 >= this.book.length || book == null) {
            return false;
        }
        Book found = findBook(book.getIsbn());
        if (found != null) {
            return false;

        }

        this.book[size] = book;
        size++;
        return true;

    }

    @Override
    public Book removeBook(long isbn) {
        int index = -1;
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i].getIsbn() == isbn) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return null;
        }
        Book value = this.book[index];
        for (int i = index + 1; i < this.size; i++) {
            this.book[i - 1] = this.book[i];
        }
        this.size -= 1;
        return value;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < this.size; i++) {
            if (this.book[i].getIsbn() == isbn) {
                return this.book[i];
            }
        }
        return null;
    }


    @Override
    public int quantity() {
        return this.size;
    }
    @Override
    public void printBook() {
        System.out.println(Arrays.toString(this.book));
    }
}