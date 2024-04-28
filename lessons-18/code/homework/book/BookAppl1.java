package homework.book;
/*
Задача 2. Создайте класс Book с полями: название - title;
автор - author; год издания - year; уникальный номер - ISBN; количество страниц - pageQuantity.

В классе Book реализуйте конструктор, геттеры и сеттеры на все поля
и метод display, который выводит информацию о книге.

Создайте класс Dictionary, который расширяет класс Book c полями: тип - type;
кол-во слов - wordQuantity.

В классе BookAppl в методе main создайте массив типа Book и в нем 4 книги и 3 словаря.
Выведите информацию о них в консоль.

Реализуйте методы, которые выдают:

общее количество страниц во всех книгах;
среднее значение количества слов в словарях;
средний возраст всех изданий.
*/

public class BookAppl1 {
    public static void main(String[] args) {
        Book1[] book = new Book1[7];
        book[0] = new Book1("War and Peace", "Leo Tolstoy", 1869, "978 - 1 - 78198 - 277 - 7", 1392);
        book[1] = new Book1("1984", "George Orwell", 1949, "978 - 0 - 451 - 52493 - 5", 328);
        book[2] = new Book1("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, "978 - 1 - 4088 - 5566 - 0", 352);
        book[3] = new Book1("The Master and Margarita", "Mikhail Bulgakov", 1967, "978 - 0 - 8021 - 9407 - 2", 402);
        book[4] = new Dictionary1("Merriam-Webster's Collegiate Dictionary", "Merriam-Webster", 2019, "978 - 0 - 87779 - 911 - 5", 1632, "Monolingual (English)", 225000);
        book[5] = new Dictionary1("The Oxford English Dictionary", "Oxford University Press", 2016, "978 - 0 - 19 - 957315 - 8", 2112, "Monolingual (English)", 355000);
        book[6] = new Dictionary1("Collins English Dictionary", "Collins", 2014, "978 - 0 - 00 - 753094 - 2", 2344, "Monolingual (English)", 722000);
        for (int i = 0; i < book.length; i++) {

            book[i].display1();
            System.out.println();

            int totalPageQuantity = getTotalPageQuantity(book);
            System.out.println("Total page quantity = " + totalPageQuantity);

            int averageWordQuantity = getAverageWordQuantity(book);
            System.out.println("Average number of words in dictionaries: " + averageWordQuantity);


            int averageAgeAllEditions = getAverageAgeAllEditions(book);
            System.out.println("Average age of all editions: " + averageAgeAllEditions);

        }
    }

    private static int getAverageAgeAllEditions(Book1[] book) {
        int totalAge = 0;
        int publicationCount = 0;
        int currentYear = 2024;
        for (int i = 0; i < book.length; i++) {
            totalAge += currentYear - book[i].getYear();
            publicationCount++;

        }
        if (publicationCount == 0) {
            return 0;
        }
        return totalAge / publicationCount;
    }

    private static int getAverageWordQuantity(Book1[] book) {
        int totalWordQuantity = 0;
        int dictionaryCount = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] instanceof Dictionary1) {
                totalWordQuantity += ((Dictionary1) book[i]).getWordQuantity();
                dictionaryCount++;
            }
        }
        if (dictionaryCount == 0) {
            return 0;
        }
        return totalWordQuantity / dictionaryCount;
    }

    private static int getTotalPageQuantity(Book1[] book) {
        int totalPageQuantity = 0;
        for (int i = 0; i < book.length; i++) {
            totalPageQuantity += book[i].getPageQuantity();


        }
        return totalPageQuantity;
    }
}