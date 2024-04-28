package homework.book;

public class Book1 {
    private String title;
    private String author;
    private int year;
    private String ISBN;
    private int pageQuantity;

    public Book1(String title, String author, int year, String ISBN, int pageQuantity) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
        this.pageQuantity = pageQuantity;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public void display1() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + year);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Page Quantity: " + pageQuantity);
    }
}