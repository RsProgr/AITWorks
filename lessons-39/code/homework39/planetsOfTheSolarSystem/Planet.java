package homework39.planetsOfTheSolarSystem;
//Задача 2. Занести планеты солнечной системы в список, содержащий:
//
//наименование;
//расстояние до Солнца;
//массу;
//количество спутников. Вывести список планет отсортированный по:
//порядку расположения в солнечной системе;
//алфавиту;
//массе;
//количеству спутников.

public class Planet implements Comparable<Planet> {
    private String name;
    private double distance;
    private double mass;
    private int moons;

    public Planet(String name, double distance, double mass, int moons) {
        this.name = name;
        this.distance = distance;
        this.mass = mass;
        this.moons = moons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }


    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", mass=" + mass +
                ", moons=" + moons +
                '}';
    }

    @Override
    public int compareTo(Planet o) {
        return Double.compare(this.distance, o.distance);
    }
}
