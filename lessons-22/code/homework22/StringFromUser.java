package homework22;
/*
Задание 2. Напишите программу, которая запрашивает строку от пользователя и затем:

сообщает сколько слов в строке
сообщает сколько букв (символов) в строке
печатает строку задом наперед, начиная с последнего слова.
 */
import java.util.Scanner;

public class StringFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        int wordCount = words.length;
        System.out.println(wordCount);
        System.out.println("=========================");

        int charCount = input.length();
        System.out.println(charCount);
        System.out.println("=======================");

        String[] reversedWords = new String[wordCount];
        for (int i = wordCount - 1, j = 0; i >= 0; i--, j++) {
            reversedWords[j] = words[i];
        }
        String reversedString = String.join(" ", reversedWords);
        System.out.println(reversedString);
    }
}