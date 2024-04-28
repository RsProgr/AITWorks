package classwork;

public class Methods2 {
    /* 4. Создайте метод, который принимает целое число и возвращает целую часть от деления его на 5.
   Пример: число 83, метод возвращает 16.

5.  Создайте метод, который находит сумму цифр двузначного целого числа.
   Пример: число 23, сумма цифр 5.

6. Деление чисел типа double, вычисление среднего арифметического.
  Давайте вычислим средний возраст нашей группы.

7. Создайте метод, который вычисляет квадрат гипотенузы по двум катетам (теорема Пифагора).


     */
      //4
    public static void main(String[] args) {
        //4
        int p = 83;
        int newPrice = restDivBy5(p);
        System.out.println("new price /5 = " + newPrice);

        //5
        int d = 55;
        System.out.println("Sum of digits = " +d + " = " + sumOfDig(d));
        //6
        int sumOfAges = 39 + 18 + 44 + 28 + 31 + 34 + 44 + 26 + 52 +60 +59 + 35 + 61;
        int numberOfStudents =  13;
        double averageAge = sumOfAges / numberOfStudents;
        double a = averageAge(sumOfAges, numberOfStudents);
        System.out.println("Average age of students = " + a);



    }
    public static int restDivBy5(int price){
        return price /5;

    }
    //5
    public static int sumOfDig(int d){
        int digi1FromRight = d % 10; // это деление с остатком даёт нам 1ую цифру справа
        int digit2 = d / 10; // это деление даёт нам 2ую цифру двузначного числа

        return   digi1FromRight + digit2;
    }
    //6
    public  static double averageAge (int a, double b){

        return a / b;

    }


}
