package homework43;
//Задание 1. Соберите в структуру Map порядка 20 стран, по несколько страны из разных континентов Земли.
//Подсчитайте количество стран на континентах из полученного списка.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countriesAndContinents {
    public static void main(String[] args) {
        Map<String, String> countryContinent = new HashMap<>();
        countryContinent.put("Russia", "Europe/Asia");
        countryContinent.put("Germany", "Europe");
        countryContinent.put("France", "Europe");
        countryContinent.put("Italy", "Europe");
        countryContinent.put("Spain", "Europe");
        countryContinent.put("Nigeria", "Africa");
        countryContinent.put("Kenya", "Africa");
        countryContinent.put("Egypt", "Africa");
        countryContinent.put("South Africa", "Africa");
        countryContinent.put("Brazil", "South America");
        countryContinent.put("Argentina", "South America");
        countryContinent.put("Peru", "South America");
        countryContinent.put("China", "Asia");
        countryContinent.put("Japan", "Asia");
        countryContinent.put("India", "Asia");
        countryContinent.put("Australia", "Australia/Oceania");
        countryContinent.put("New Zealand", "Australia/Oceania");
        countryContinent.put("Canada", "North America");
        countryContinent.put("United States", "North America");
        countryContinent.put("Mexico", "North America");

        System.out.println(countryContinent.size());
        System.out.println(countryContinent.isEmpty());
        String continent = countryContinent.get("China");
        System.out.println("Continent of China: " + continent);

        System.out.println(countryContinent.containsKey("India")); // true
        System.out.println(countryContinent.containsKey("Estonia")); // false

        Set<Map.Entry<String, String>> entries = countryContinent.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


        Map<String, Integer> continentCountMap = new HashMap<>();
        for (String cont : countryContinent.values()) {
            if (continentCountMap.containsKey(cont)) {
                continentCountMap.put(cont, continentCountMap.get(cont) + 1);
            } else {
                continentCountMap.put(cont, 1);
            }
        }
        System.out.println(" ");

        System.out.println("Number of countries on each continent:");
        for (Map.Entry<String, Integer> entry : continentCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " countries");
        }
    }
}