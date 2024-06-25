package homework39.alphabet;
//Задача 3. Заполните структуру типа ArrayList символами латинского алфавита от A(65) до Z(...).

import java.util.ArrayList;
import java.util.List;

public class Alphabets {

    public static void main(String[] args) {
        List<Character> alphabetLists = new ArrayList<>();

        for (int i = 65; i <= 90; i++) {
            char ch = (char) i;
            alphabetLists.add(ch);
        }
        System.out.println("Алфавит от A до Z:");
        for (char ch : alphabetLists) {
            System.out.println(ch + " ");
        }
    }
}