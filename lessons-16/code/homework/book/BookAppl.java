package homework.book;

public class BookAppl {
    public static void main(String[] args) {

        Dictionary dictionary1 = new Dictionary("Oxford English Dictionary", "Oxford University Press", 2010, "978-0199573158", "English", 300000);
        Dictionary dictionary2 = new Dictionary("Collins German Dictionary", "Collins Dictionaries", 2018, "978-0008270769", "German", 250000);

        System.out.println("Dictionary 1:");
        dictionary1.display();
        System.out.println();
        System.out.println("Dictionary 2:");
        dictionary2.display();
    }
}