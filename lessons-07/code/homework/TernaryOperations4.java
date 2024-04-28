package homework;
/*
Задача 6. Напишите программу, которая запрашивает у пользователя длины трех сторон треугольника
 и определяет его тип (равносторонний, равнобедренный, разносторонний).
 */

import java.util.Scanner;

public class TernaryOperations4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Draw 3 sides of the triangle: ");
        System.out.println("side 1:");
        double side1 = scanner.nextDouble();
        System.out.println("side 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("side 3: ");
        double side3 = scanner.nextDouble();

        String type = determineTriangleType(side1, side2, side3);
        System.out.println("triangle type : " + type);
    }
    private static String determineTriangleType(double side1, double side2, double side3) {
        String type = (side1 == side2 && side2 == side3) ? "равносторонний" :
                (side1 == side2 || side1 == side3 || side2 == side3) ? "равнобедренный" : "разносторонний";
        return type;
    }
}