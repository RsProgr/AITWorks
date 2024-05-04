package classwork27.final_example;

public class main4 {
    public static void main(String[] args) {
        //так делать ненадо: final переменные должны быть не неизменяемые
        final double[] values = {3.14};
        // нельзя переопределить перенеменную values
        values[0] = 0; // меняем данные в уже существующем массиве, но не переопределяем переменную
        System.out.println(" площадь окружности с радиусом 2: " + values[0] * 4);
    }
}
