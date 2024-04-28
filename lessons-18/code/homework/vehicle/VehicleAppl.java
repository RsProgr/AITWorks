package homework.vehicle;
/*
Задача 3. Создайте класс Vehicle с полями:
длина;
ширина;

В автопарке 5 транспортных средств, каждое имеет свою длину и ширину.
Рассчитайте необходимую площадь под стоянку автопарка.
*/
public class VehicleAppl {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Vehicle(5.0, 3.0);
        vehicles[1] = new Vehicle(3.5, 1.5);
        vehicles[2] = new Vehicle(5.3, 2.2);
        vehicles[3] = new Vehicle(4.6, 2.5);
        vehicles[4] = new Vehicle(2.6, 1.5);

        double totalArea = 0;
        for (int i = 0; i < vehicles.length; i++) {
            totalArea += vehicles[i].getArea();

        }
        System.out.printf("Required area for car park parking: %.2f ", totalArea);
    }
}