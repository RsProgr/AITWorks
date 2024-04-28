package classwork;
/*1. Создайте метод, который возвращает целое число, противоположное по знаку.
     Пример: число -46, метод возвращает 46.

  2. Создайте метод, который возвращает куб числа.
     Пример: число 20, метод возвращает 8 000.

  3. Создайте метод, который принимает целое число и возвращает остаток от деления его на 2.
     Пример: число 41, метод возвращает 1.*/

public class Methods1 {

    public static void main(String[] args) {
        //1
        int x = 56;
        x = absolute(x);
        System.out.println("x = " +x);
        //2
        double a = 10.0d; //задаём действительное число
        System.out.println("cub = " + cubOfNumber(a));
        //3
        int z = 58;
        System.out.println(z + " rest of devision by 2 = " + restDivesionBy2(z));

    }
    //2
    public static double cubOfNumber(double z) {
        return z * z * z;
    }
    //1
    public static int absolute(int number){ // жто сигнатура метода(1-ая строчка каждого метода
        return - number;
       // return Math.abs(number); можно и так
    }
    //3
    public static int restDivesionBy2(int z){

        return z % 2;
    }

}
