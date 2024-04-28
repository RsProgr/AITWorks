package classwork;

/*
Распечатать в консоли таблицу умножения от 1 до 10.
*/

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 1; // первый множитель
        int m = 1;
        while (n <= 10) {

            while (m <= 10) {
                System.out.print(n + " * " + m + " = " + n * m + " | ");
                m++;
            }
            System.out.println();// next line
            m = 1;
            n++;
        }
    }
}