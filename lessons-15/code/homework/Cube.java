package homework;
/*
Задача 1. Создать класс Cube, описывающий куб cо стороной a.
Реализовать в нем методы определения периметра p (сумма длин всех ребер),
площади s (сумма площадей всех граней) и объема v.
Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
 */

public class Cube {
    double side;

    public Cube(double side) {
        this.side = side;
    }
    private double perimeter(){
        return 12 * side;
    }
    private double surfaceArea(){
        return 6 * side * side;
    }
    private double volume(){
        return side * side * side;
    }

    public void printInfo(String name) {
        System.out.println(name + ":" );
        System.out.println("Perimeter: " + perimeter());
        System.out.println(" Surface Area: " + surfaceArea());
        System.out.println(" Volume: " + volume());
        System.out.println(" ----------------------------------- ");
    }
}