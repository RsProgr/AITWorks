package homework.ait.book;

import homework.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book(9785041087388L, "War and Peace", "Lev Tolstoy", 1868);
        Book book2 = new Book(9780140449188L, "Crime and Punishment", "Fyodor Dostoevsky", 1866);
        Book book3 = new Book(9781853262715L, "Pride and Prejudice", "Jane Austen", 1813);
        Book book4 = new Book(9781853262715L, "Pride and Prejudice", 1813);

        book1.display();
        book2.display();
        book3.display();
        book4.display();
    }
}