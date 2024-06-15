package homework35.car;

import java.util.Arrays;

public class CarAppl {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota",50000);
        Car car2 = new Car("Toyota",30000);
        Car car3 = new Car("Honda", 40000);

        Car[] cars = {car1, car2, car3};

        Arrays.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
    }

