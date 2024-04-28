package homework;

public class Task1 {

    public static void main(String[] args) {
        //1
        double ribLength = 20.0d;
        //2
        double parallelogramBase = 15.5d;
        double parallelogramHeight = 10.4d;

        //1
        System.out.println("Cube volume = " + cubeVolume(ribLength));
        System.out.println("Cube area = " + cubeArea(ribLength));
        //2
        System.out.println("area of a parallelogram = " + areaOfaParallelogram(parallelogramBase, parallelogramHeight));
    }
        //1
    public static double cubeVolume(double ribLenght) {
        return (ribLenght * ribLenght * ribLenght);
    }

    public static double cubeArea(double ribLenght) {

        return ((ribLenght * ribLenght) * 6);
    }
         //2
        public static double areaOfaParallelogram ( double parallelogramBase, double parallelogramHeight ){
            return (parallelogramHeight * parallelogramBase);
        }
    }


    /* Натура́льные чи́сла  — числа, возникающие естественным образом при счёте (1, 2, 3, 4, 5, 6, 7 и так далее[1]).
    Последовательность всех натуральных чисел, расположенных в порядке возрастания, называется натуральным рядом[2].
    Множество натуральных чисел является бесконечным, так как для любого натурального числа (n)
�  найдётся натуральное число, большее чем (n)
�  Натуральные числа ещё можно называть целыми положительными числами. Поэтому отрицательные и нецелые (дробные) числа
    к натуральным не относятся.*/

/*Просто́е число́ — натуральное число, имеющее ровно два различных натуральных делителя.
Другими словами, натуральное число
является простым, если оно отлично от 1
и делится без остатка только на 1
и на само себя
Пример: число 2 простое делится на 1 и на 2
а 4 не является простым, так как, помимо 1 и 4
делится на 2 имеет три натуральных делителя.

Последовательность простых чисел начинается так:

2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179,
181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277,
281, 283, 293 ... ---------------- они все делятся на 1 и на само себя без остатка
*/