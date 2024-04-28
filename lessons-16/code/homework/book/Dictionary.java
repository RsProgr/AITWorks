package homework.book;

public class Dictionary extends Book {
    private String language;
    private int numberOfDefinitions;

    public Dictionary(String title, String author, int year, String isbn, String language, int numberOfDefinitions) {
        super(title, author, year, isbn);
        this.language = language;
        this.numberOfDefinitions = numberOfDefinitions;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfDefinitions() {
        return numberOfDefinitions;
    }

    public void setNumberOfDefinitions(int numberOfDefinitions) {
        this.numberOfDefinitions = numberOfDefinitions;
    }
}
