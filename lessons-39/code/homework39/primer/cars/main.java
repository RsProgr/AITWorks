package homework39.primer.cars;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(0, "Mazda");
        System.out.println(cars);
        System.out.println("==================");

        cars.add(0, "mmm");
        System.out.println(cars);
        System.out.println("======================");

        System.out.println(cars.get(0));
        cars.set(1, "Opel");

        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        System.out.println("=========================");

//        cars.clear();
//        System.out.println(cars);

//        System.out.println(cars.size());
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));

        for (String i : cars) {
            System.out.println(i);
        }
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        System.out.println("=====================");

        ArrayList<String> cars1 = new ArrayList<String>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("Mazda");
        Collections.sort(cars1);
        for (String i  : cars1) {
            System.out.println(i);
        }
        ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
        myNumbers2.add(33);
        myNumbers2.add(15);
        myNumbers2.add(20);
        myNumbers2.add(34);
        myNumbers2.add(8);
        myNumbers2.add(12);
                Collections.sort(myNumbers2);
                for (int i : myNumbers2) {
                    System.out.println(i);

                }
            }
        };



