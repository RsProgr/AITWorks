package homework;
/*
Задача 1. Чему равно значение выражения x-- + --x при x = 5?
Проверьте свое предположение с помощью кода.
 */

public class Expression1 {
    public static void main(String[] args) {

        int x = 5;
        int result = (--x) + (x--);
        while (x <= 5) {
            --x;
        }
        System.out.println("Value = " +result);
    }
}
