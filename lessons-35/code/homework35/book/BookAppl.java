package homework35.book;

import java.util.Arrays;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book("John Doe",2020);
        Book book2 = new Book("John Doe",2018);
        Book book3 = new Book("Jane Doe",2021);

        Book[] books = {book1, book2, book3};

        Arrays.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}