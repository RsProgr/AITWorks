package homework;
/*
Задача 5. (*) Напечатайте на экране шахматную доску размером 8х8.
0 - белая клеточка, 1 - черная.
Левая верхняя клеточка должна быть 0, левая нижняя - 1.
 */
public class ChessBoard {

    public static void main(String[] args) {
        int size = 8;
        int i = 0;

        while (i < size) {
            int value = i % 2;
            int count =  0;

            while (count < size) {

                System.out.print(value + " ");
                value = (value + 1) % 2;
                count++;
            }
            System.out.println();
            i++;
        }
    }

}