package homework35.book;
//Сделать пример класса c интерфейсом Comparable по двум полям. Например:
//книги одного автора, но с разными годами издания.

public class Book implements Comparable<Book> {
    private String author;
    private int publicationYear;

    public Book(String author, int publicationYear) {
        this.author = author;

        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        int authorComparison = this.author.compareTo(o.author);
        if (authorComparison != 0) {
            return authorComparison;
        }
        return Integer.compare(this.publicationYear, o.publicationYear);

    }
}
