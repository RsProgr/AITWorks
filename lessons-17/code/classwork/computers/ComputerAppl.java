package classwork.computers;
/*
Задание1.

Создать "семейство" классов Computer, Laptop, SmartPhone.

Реализовать метод, который посчитает общий объем RAM в имеющихся на складе устройствах.

Реализовать метод, который посчитает общий вес имеющихся на складе устройств.
*/

import classwork.computers.model.Computer1;
import classwork.computers.model.Laptop1;
import classwork.computers.model.SmartPhone1;

public class ComputerAppl {
    public static void main(String[] args) {


        Computer1[] comp = new Computer1[3];
        comp[0] = new Computer1("i5", 12, 512, "HP", 1000);
        comp[1] = new Laptop1("i7", 16, 512, "Samsung", 800, 15, 2.2, 8);
        comp[2] = new SmartPhone1("Snapdragon 8 gen 2", 64, 2042, "Samsung", 1200, 11, 0.3, 10, "Android 14", true);

        printArray(comp);

        int totalRam = getTotalRam(comp);
        System.out.println("Total Ram: " + totalRam);
        Laptop1 laptop1 = (Laptop1) comp[1]; // down casting приведение к нужному типу
        System.out.println(laptop1.getWeight());

//        Computer1 computer1 = (Laptop1) comp[0];
//        System.out.println(computer1);

        double totalWeight = getTotalWeight(comp);
        System.out.println("Total weight = " + totalWeight);


    }

    private static double getTotalWeight(Computer1[] comp) {
        double res = 0;
        for (int i = 0; i < comp.length; i++) {
            if (comp[i] instanceof Laptop1) {
                Laptop1 laptop1 = (Laptop1) comp[i];
                res += ((Laptop1) comp[i]).getWeight();
            }

        }
        return res;
    }


    private static int getTotalRam(Computer1[] comp) {
        int res = 0;
        for (int i = 0; i < comp.length; i++) {
            res += comp[i].getRam();
        }
        return res;
    }

    public static void printArray(Computer1[] comp) {
        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i].toString());
        }
    }
}
