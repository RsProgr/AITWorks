package homework39.planetsOfTheSolarSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SolarSystemAppl {
    public static void main(String[] args) {
        List<Planet> planetList = new ArrayList<>();

        planetList.add(new Planet("Venus", 108.2, 4.87, 0));
        planetList.add(new Planet("Mercury", 57.9, 0.33, 0));
        planetList.add(new Planet("Earth", 149.6, 5.97, 1));
        planetList.add(new Planet("Jupiter", 778.6, 1898, 79));
        planetList.add(new Planet("Mars", 227.9, 0.64, 2));
        planetList.add(new Planet("Uranus", 2872.5, 86.8, 27));
        planetList.add(new Planet("Saturn", 1433.5, 568, 83));
        planetList.add(new Planet("Neptune", 4495.1, 102, 14));

        int size = planetList.size();
        System.out.println("Number of planets = " + size);

        System.out.println("===========Unsorted list============");
        for (Planet p : planetList) {
            System.out.println(p);
        }
        planetList.sort(Planet::compareTo);
        System.out.println("==========sorted by distance===================");
        for (Planet p : planetList) {
            System.out.println(p);
        }
        Comparator<Planet> planetComparator = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("============sorted by name=============");
        planetList.sort(planetComparator);
        for (Planet p : planetList) {
            System.out.println(p);
        }
        Comparator<Planet> massComparator = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getMass(), o2.getMass());
            }
        };
        System.out.println("===========sorted by mass==============");
        planetList.sort(massComparator);
        for (Planet p : planetList) {
            System.out.println(p);
        }
        Comparator<Planet> moonsComparator = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Integer.compare(o1.getMoons(), o2.getMoons());
            }
        };
        System.out.println("=================sorted by number of moons===============");
        planetList.sort(massComparator);
        for (Planet p : planetList) {
            System.out.println(p);
        }
    }
}