package homework36.city_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Berlin", 800000, "Germany", 7.0);
        cities[1] = new City("Berlin", 670000, "Germany", 7.5);
        cities[2] = new City("Chicago", 2700000, "USA", 6.0);
        cities[3] = new City("Atlanta", 470000, "USA", 8.0);
        cities[4] = new City("New York", 8500000, "USA", 6.5);
        cities[5] = new City("Dallas", 1300000, "USA", 3.0);
    }

    private void printArray(Object[] arr, String title) {
        System.out.println("==================" + title + "=====================");
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    // Find the index of an element in an array of Comparable objects
    @Test
    void testComparable() {
        printArray(cities, "Original array: ");
        Arrays.sort(cities);
        printArray(cities, "Native sorting - by name");
        City city = new City("Dallas", 0, null, 0);
        int index = Arrays.binarySearch(cities, city);
        System.out.println("Index = " + index);
    }

    // Find the index of an element in an array of objects sorted using Comparator
    @Test
    void testComparator() {
        Comparator<City> comparatorByPopulation = Comparator.comparingInt(City::getPopulation);
        Arrays.sort(cities, comparatorByPopulation);
        printArray(cities, "Sorting by population");
        City findCity = new City(null, 1300000, null, 0);
        int index = Arrays.binarySearch(cities, findCity, comparatorByPopulation);
        System.out.println("Index = " + index);
    }

    // Copy part of an array into a new array
    @Test
    void testCopyOfRange() {
        printArray(cities, "List of cities as is");
        City[] citiesCopyRange = Arrays.copyOfRange(cities, 2, cities.length);
        printArray(citiesCopyRange, "Cities copy of range from 2 to last");
    }

    // Create a copy of an array, increase its length, and insert contents inside
    @Test
    void testSystemArrayCopy() {
        printArray(cities, "List of cities as is");
        City[] citiesCopy = new City[cities.length * 2];
        System.arraycopy(cities, 1, citiesCopy, 4, cities.length - 2);
        printArray(citiesCopy, "System.arraycopy");
    }

    // Increase the size of an array, sort the new array, and find the index where a new element will be inserted
    @Test
    void testArrayCopy() {
        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2);
        printArray(citiesCopy, "citiesCopy before sort of cities");
        Arrays.sort(cities);
        printArray(cities, "citiesCopy after sort of cities");
        Comparator<City> comparator = Comparator.comparing(City::getName);
        Arrays.sort(citiesCopy, 0, cities.length, comparator);
        printArray(citiesCopy, "citiesCopy sort by name");
        System.out.println("--------------------------------");
        City newCity = new City("Astana", 0, null, 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, newCity, comparator);
        System.out.println("City: " + newCity.getName() + ", index = " + index);
    }

    // Insert a new object into the array while maintaining the sort order
    @Test
    void testKeepSorted() {
        Arrays.sort(cities);
        printArray(cities, "Native order (name)");
        City city = new City("Gotem", 690000, "USA", 1);
        City[] citiesCopy = Arrays.copyOf(cities, cities.length + 1); // create a copy of the array with length increased by 1
        int index = Arrays.binarySearch(citiesCopy, 0, citiesCopy.length - 1, city);
        index = index >= 0 ? index : -index - 1; // process the received index
        System.arraycopy(citiesCopy, index, citiesCopy, index + 1, citiesCopy.length - index - 1); // shift the array
        citiesCopy[index] = city; // insert the element at the correct position
        cities = citiesCopy;
        printArray(cities, "Added city and array keep sorted");
    }
}