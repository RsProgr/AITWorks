package homework.book.model;
/*
Задача 2. Создать класс Book в пакете book.model.
В этом классе определить поля: private long isbn; private String title; private String author;
private int yearOfPublishing; Создать конструкторы для иницализации всех полей,
и конструктор для инициализации полей при отсутствии автора.
Остальные конструкторы на Ваше усмотрение. Создать геттеры и сеттеры, исходя из логики и необходимости.
Создать метод public void display() для печати в консоль информации о книге.

Создать класс BookAppl в пакете ait.book с методом main.
В методе main создать несколько экземпляров Book и вывести для каждого из них результат работы метода display.
*/

public class Book {

    private long isbn;
    private String tittle;
    private String author;
    private int year0fPublishing;

    public Book(long isbn, String tittle, String author, int year0fPublishing) {
        this.isbn = isbn;
        this.tittle = tittle;
        this.author = author;
        this.year0fPublishing = year0fPublishing;
    }

    public Book(long isbn, String tittle, int year0fPublishing) {
        this.isbn = isbn;
        this.tittle = tittle;
        this.year0fPublishing = year0fPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear0fPublishing() {
        return year0fPublishing;
    }

    public void setYear0fPublishing(int year0fPublishing) {
        this.year0fPublishing = year0fPublishing;
    }

    public void display() {
        System.out.println("ISBN: " + isbn + ", Title: " + tittle + (author != null ? ", Author: " + author :
                ", Author: Unknown") + ", Year of publishing: " + year0fPublishing);
        System.out.println("------------------------");
    }
}