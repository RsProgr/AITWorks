package classwork;

/*
**Задание 1:**
  Проверка положительное или отрицательное число.
  Проверка четное или нечетное целое число.
  Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
  прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно.
*/

public class Conditions {

    public static void main(String[] args) {
        int n = -135;

        if( n > 0 ) {

            System.out.println(n + " : this is POSITIVE number ");
        }
        else {
            System.out.println(n + " : this is NEGATIVE number  ");
        }

        int daten = -123;
        if((daten % 2 == 1  ||  (daten %2) == -1) ){

            System.out.println(daten + " is odd number(нечетное)");
        }
        else {

            System.out.println(daten + " is even number (чётное)");
        }

        int age = 16;
        if (age >= 18) {
            System.out.println("Вам разрешено действовать самостоятельно");
        }
        else {
            System.out.println("Вам надо " + "придти вместе с вашим опекуном");
        }

    }
}
