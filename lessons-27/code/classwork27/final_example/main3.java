package classwork27.final_example;

public class main3 {
    public static void main(String[] args) {
        // при попытки переопределения переменной будет ошибка
        final double PI = 3.14;
        System.out.println(" площадь окружности с радиусом 2: " + PI * 4);
    }
}
