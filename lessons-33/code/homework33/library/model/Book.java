package homework33.library.model;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private long isbn;
    private String title;
    private String author;
    private int isYear;

    public Book(String author, int inYear, long isbn, String title) {
        this.author = author;
        this.isYear = inYear;
        this.isbn = isbn;
        this.title = title;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getInYear() {
        return isYear;
    }

    public void setInYear(int inYear) {
        this.isYear = inYear;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + isYear + ", ISBN: " + isbn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn && isYear == book.isYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public int compareTo(Book o) {
        int res = this.isYear - o.isYear;
        return res;
    }
}