package classwork27.final_example;

public class main5 {
    public static void main(String[] args) {
        //так делать ненадо: final переменные должны быть не неизменяемые
        final Car car = new Car("bmw", 2008);
        // car = new Car("audi", 1990); // ошибка
        car.builtYear = 2050;
        System.out.println(car);
    }
}
