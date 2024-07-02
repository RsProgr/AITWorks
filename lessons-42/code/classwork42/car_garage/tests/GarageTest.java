package classwork42.car_garage.tests;

import classwork42.car_garage.dao.Garage;
import classwork42.car_garage.dao.GarageHashSetImpl;
import classwork42.car_garage.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class GarageTest {

    Garage garage;

    Car[] cars;

    @BeforeEach
    public void setUp() throws Exception {

        // garage = new GarageImpl(5);

       // garage = new GarageArrayListImpl(5); // switch implementation

        garage = new GarageHashSetImpl(5);

        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model3", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

//		for (int i = 0; i < cars.length; i++) {
//			garage.addCar(cars[i]);
//		}

        for (Car car : cars) {
            garage.addCar(car);
        }
    }

    @Test
    public void testAddCar() {
        // can't add existed element
        Assertions.assertFalse(garage.addCar(cars[0]));
        // add one car
        Car car = new Car("Number5", "Model4", "Company2", 2.0, "Green");
        Assertions.assertTrue(garage.addCar(car));
        // add more than capacity
        car = new Car("Number6", "Model4", "Company2", 2.0, "Green");
        Assertions.assertFalse(garage.addCar(car));
    }

    @Test
    public void testRemoveCar() {
        // remove element
        Assertions.assertEquals(cars[0], garage.removeCar("Number1"));
        // remove absent element, try to remove already removed element
        Assertions.assertNull(garage.removeCar("Number1"));
    }

    @Test
    public void testFindCarByRegNumber() {
        // find car by regNumber
        Car car = garage.findCarByRegNumber("Number4");
        Assertions.assertEquals(cars[3], car);
        // check fields
        Assertions.assertEquals(cars[3].getColor(), car.getColor());
        Assertions.assertEquals(cars[3].getEngine(), car.getEngine());
        // ???
        Assertions.assertEquals(cars[3], garage.findCarByRegNumber("Number4"));
        // find absent element
        Assertions.assertNull(garage.findCarByRegNumber("Number40"));
    }

    @Test
    public void testFindCarsByModel() {
        Car[] expecteds = {cars[2]};
        Car[] actuals = garage.findCarsByModel("Model3");
        sortCars(expecteds);
        sortCars(actuals);
        Assertions.assertArrayEquals(expecteds, actuals);
    }

    private void sortCars(Car[] expecteds) {
        Arrays.sort(cars, Comparator.comparing(Car::getRegNumber));
    }

    @Test
    public void testFindCarsByCompany() {
        Car[] expecteds = {cars[2], cars[3]};
        Car[] actuals = garage.findCarsByCompany("Company2");
        Assertions.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testFindCarsByColor() {
        Car[] expecteds = {cars[0], cars[2]};
        Car[] actuals = garage.findCarsByColor(new String("Red"));
        Assertions.assertArrayEquals(expecteds, actuals);
        // find absent element (no such color)
        Assertions.assertEquals(0, garage.findCarsByColor("Purple").length);
    }

    @Test
    public void testFindCarsByEngine() {
        Car[] expecteds = {cars[1], cars[3]};
        Car[] actuals = garage.findCarsByEngine(1.9, 2.6);
        Assertions.assertArrayEquals(expecteds, actuals);
    }
}