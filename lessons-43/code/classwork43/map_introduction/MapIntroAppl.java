package classwork43.map_introduction;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntroAppl {
    public static void main(String[] args) {
        // создадим Мар, которая содержит наименование города   и его населения

        //key - город, тип String
        //value - это население , тип Integer

        Map<String, Integer> usaCities = new TreeMap<>(); // create object, type of object  - TreeMap
        usaCities.put("Denver", 600_000);
        usaCities.put("Boston", 670_000);
        usaCities.put("Chicago", 2_700_000);
        usaCities.put("Atlanta", 470_000);
        usaCities.put("New York", 8_500_000);
        usaCities.put("Dallas", 1_300_000);
        usaCities.replace("Dallas", 1_300_010); // update

        //map size
        System.out.println(usaCities.size()); //6
        System.out.println(usaCities.isEmpty());
        int population = usaCities.get("Chicago");
        System.out.println("population of Chicago is:" + population);

        int pop1 = usaCities.get("Boston");
        System.out.println("population of Boston is:" + pop1);

        //check key
        System.out.println(usaCities.containsKey("Boston")); //true
        System.out.println(usaCities.containsKey("Texas")); //false


        Collection<Integer> totalPopulation = usaCities.values(); // create new object
        int total = 0;

        for (Integer i : totalPopulation) {
            //total = total + i;
            total += i;
        }
        System.out.println("Total population in cities: " + total);

        //2nd approach
        Set<String> setOfCities = usaCities.keySet();
        total = 0;
        for (String str : setOfCities) {
            total += usaCities.get(str);
        }
        System.out.println("Total population in cities: " + total);

        // print map
        System.out.println("============Print Map ==========");
        Set<String> keys = usaCities.keySet() ;
        for (String str : keys ) {
            System.out.println(str + " name of city");
        }

        // print map using Entry
        Set<Map.Entry<String, Integer>> entries = usaCities.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // print map another time
        System.out.println(usaCities.entrySet());
    }
}
