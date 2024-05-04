package classwork27.static_example;

import java.util.Scanner;

public class Car {
    public String vendor; // поле связанное только с объектом типа Car
    public  double mileage; // поле связанное только с объектом типа Car
    public static double totalMileage = 0; // поле связанное с классом Car

    static { // статический инициализатор, выполняется в самом начале
        //программы один раз для инициализации статического поля
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите изначальное значение для totalMileage: ");
        totalMileage = scanner.nextDouble();
    }


    public Car(String vendor, int mileage) {
        this.vendor = vendor;
        this.mileage = mileage;

    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", mileage=" + mileage +
                '}';
    }
    public void go(double distance){
        Car.totalMileage += distance; // увеличиваем значение поля объекта типа Car
        this.mileage += distance; // увеличиваем значение поля  класса Car
        System.out.println("Car " + this.vendor + " drove " + distance + " miles ");
        System.out.println("Общий пробег всех машин: " + Car.totalMileage); // выводим значение поля класса Car
    }
    public static String drawCar(Car inputCar) {

        StringBuilder sb = new StringBuilder();

        sb.append("  ______\n");

        sb.append(" /|_||_\\`.__\n");

        sb.append("(   _    _ _\\\n");

        sb.append("=`-(_)--(_)-'   ");

        sb.append(inputCar.vendor);

        sb.append(", ");

        sb.append(inputCar.mileage + "/" + Car.totalMileage);

        // this.mileage; // ошибка, статический метод не имеет доступа к this,

        // потому что он связан только с классом Car, а не с объектами его типа

        return sb.toString();


        }
        public String  drawCar2(){
            StringBuilder sb = new StringBuilder();

            sb.append("  ______\n");

            sb.append(" /|_||_\\`.__\n");

            sb.append("(   _    _ _\\\n");

            sb.append("=`-(_)--(_)-'   ");

            sb.append(this.vendor);

            sb.append(", ");

            sb.append(this.mileage + "/" + Car.totalMileage);

            // this.mileage; // ошибка, статический метод не имеет доступа к this,

            // потому что он связан только с классом Car, а не с объектами его типа

            return sb.toString();


        }
}