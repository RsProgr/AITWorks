package homework24;
// создайте иерархию классов для представления различных
// 5 геометрических фигур, используя абстрактные классы и методы.

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // абстрактный метод для получения площади
    public abstract double getArea();

    // абстрактный метод для получения периметра
    public abstract double getPerimeter();

    // общий метод для вывода информации о фигуре
    public void printInfo() {
        System.out.println("Цвет: " + color);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }
}


class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Rhombus extends Shape {
    private double side, height;

    public Rhombus(String color, double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return side * height;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}


class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square("red", 3),
                new Square("white", 11),
                new Circle("orange", 5),
                new Triangle("black", 5, 3, 2),
                new Rectangle("blue", 6, 5),
                new Rhombus("green", 3, 4)
        };

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}