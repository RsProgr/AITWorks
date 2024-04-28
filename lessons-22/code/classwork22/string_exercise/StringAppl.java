package classwork22.string_exercise;

import java.util.Arrays;

public class StringAppl {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str);
        System.out.println("=====================");
        String str1 = "Hello";
        char[] str2 = {32, 'w', 'o', 'r', 'l', 'd'}; // 'пробел' - тож самое что и 32
        String str3 = new String(str2);
        String str4 = str1 + str3;
        System.out.println(str4);
        System.out.println("=====================");
        str = str1.concat(str3); // объеденяем строки
        System.out.println(str);
        //lenght
        System.out.println("==========================");
        int l = str.length();
        System.out.println("Length of string: " + l);
        System.out.println("=========================");

        //ChartAt
        char c = str.charAt(str.length() - 1);
        System.out.println(c); // last symbol
        System.out.println("=========================");
        //print every letter of string
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
        System.out.println("=========================");
        String w1 = "World";
        String w2 = "world";
        boolean check = w1.equals(w2);
        System.out.println(check); // expect false
        check = w1.equalsIgnoreCase(w2); // игнорирует регистр
        System.out.println(check); // expect true
        System.out.println("=========================");
        //toLowerCase,  toUpperCase
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase); // hello world
        String upperCase = str.toUpperCase();
        System.out.println(upperCase); // HELLO WORLD
        System.out.println("=========================");
        // indexOf
        int index = str.indexOf('l');
        System.out.println(index); // 2
        index = str.lastIndexOf('l');
        System.out.println(index); // 9
        index = str.indexOf("world"); // с какого индекса начинается слово
        System.out.println(index);
        System.out.println("=========================");
        index = str.indexOf('l', 4); // от 4 индекса
        System.out.println(index);
        System.out.println("=========================");
        //subString
        System.out.println(str.substring(5)); // world
        System.out.println(str.substring(2, 7)); // from to
        System.out.println("===================");
        System.out.println(str.replace('o', 'a')); // меняем
        System.out.println(str);
        System.out.println("===============================================");
        System.out.println(str.replace("o", "o-o-o"));
        System.out.println("===============================================");
        // trim - убираем пробелы
        String string = "        Bill Smith      ";
        System.out.println(string.trim());
        System.out.println("===============================================");
        //number of words, or letters
        String string1  = "One two three four five six seven";
        String[] words = string1.split(" ");
        System.out.println("number of words = " + words.length);
        System.out.println("===============================================");
        //print with of loop
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        // print with Arrays.toString
        System.out.println(Arrays.toString(words));
        System.out.println("===============================================");
        String[] letters = string1.split("");
        System.out.println(letters.length);
        System.out.println(Arrays.toString(letters));

    }
}
