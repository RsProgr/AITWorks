package homework22;

/*
Задача 1. Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
Выполнить практикум с этой строкой:

Распечатать последний символ строки.
Найти позицию подстроки “Java” в строке.
Проверить, содержит ли заданная строка подстроку “Java”.
Заменить все символы “o” на “a”.
Преобразуйте строку к верхнему регистру.
Преобразуйте строку к нижнему регистру.
Вырезать подстроку Java c помощью метода substring().
Проверить, заканчивается ли строка подстрокой “!!!”.
Проверить, начинается ли строка подстрокой “I'm proud”.
 */
public class Stringg {
    public static void main(String[] args) {
        String str = ("I'm proud to learn Java! Java is the most famous programming language!!!");
        char lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar);
        System.out.println("===================");

        int index = str.lastIndexOf("Java");
        System.out.println(index);
        System.out.println("========================");

        boolean strJava = str.contains("Java");
        System.out.println(strJava);
        System.out.println("=======================");

        System.out.println(str.replace('o', 'a'));
        System.out.println("===================");

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println("===============================");

        System.out.println(str.substring(19, 23));
        System.out.println("=======================");

        boolean endStr = str.endsWith("!!!");
        System.out.println(endStr);
        System.out.println("=============================");

        boolean startStr = str.startsWith("I'm proud");
        System.out.println(startStr);
    }
}