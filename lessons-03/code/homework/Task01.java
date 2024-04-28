package homework;

public class Task01 {

    public static void main(String[] args) {
        double radius = 200;
        double sideOfSquare = 500;
        double lengthOfRectangle = 1000;
        double widthOfRectangle = 2000;

        // Вызов методов и вывод результатов
        System.out.println("If radius = " + radius + ": Area of a circle = " + circleArea(radius));
        System.out.println("If the side of the square = " + sideOfSquare + ": area of the square =  " + squareArea(sideOfSquare));
        System.out.println("If the sides of the rectangle = " + lengthOfRectangle + " и " + widthOfRectangle +
                ": area of such a rectangle = " + rectangleArea(lengthOfRectangle, widthOfRectangle));
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Метод вычисления площади квадрата
    public static double squareArea(double side) {
        return side * side;
    }

    // Метод вычисления площади прямоугольника
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

}

