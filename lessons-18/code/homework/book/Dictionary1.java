package homework.book;

public class Dictionary1 extends Book1{
    private String type;
    private int wordQuantity;

    public Dictionary1(String title, String author, int year, String ISBN, int pageQuantity, String type, int wordQuantity) {
        super(title, author, year, ISBN, pageQuantity);
        this.type = type;
        this.wordQuantity = wordQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWordQuantity() {
        return wordQuantity;
    }

    public void setWordQuantity(int wordQuantity) {
        this.wordQuantity = wordQuantity;
    }
}