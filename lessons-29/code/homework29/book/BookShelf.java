import java.util.ArrayList;
import java.util.List;

class BookShelf {
    private List<Book> books = new ArrayList<>();

    static class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return title + " by " + author + ", " + year;
        }
    }

    void addBook(String title, String author, int year) {
        this.books.add(new Book(title, author, year));
    }

    class Iterator {
        private int cursor = 0;

        public Book nextBook() {
            if (cursor < books.size()) {
                Book next = books.get(cursor);
                cursor++;
                return next;
            } else {
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return "Полка с книгами{" +
                "книги=" + books +
                '}';
    }
}

class Main2 {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Анна Каренина", "Лев Толстой", 1877);
        bookShelf.addBook("Преступление и наказание", "Фёдор Достоевский", 1866);
        bookShelf.addBook("Гарри Поттер и философский камень", "Джоан Роулинг", 1997);
        bookShelf.addBook("Мастер и Маргарита", "Михаил Булгаков", 1967);


        BookShelf.Iterator iterator = bookShelf.new Iterator();
        for (int i = 0; i < 3; i++) {
            BookShelf.Book nextBook = iterator.nextBook();
            if (nextBook != null) {
                System.out.println("Следующая книга: " + nextBook);
            } else {
                System.out.println("Больше книг нет.");
                break;
            }
        }
    }
}