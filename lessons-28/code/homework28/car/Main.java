package homework28.car;

public class Main {
    public static void main(String[] args) {
        CarArrayList carList = new CarArrayList();

        carList.add(new Car("Toyota", 2002));
        carList.add(new Car("BMW", 2005));
        carList.add(new Car("Audi", 2015));

        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }

        Car removedCar = carList.remove(1);
        System.out.println("Removed Car: " + removedCar);

        System.out.println("List after removal:");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }
    }
}