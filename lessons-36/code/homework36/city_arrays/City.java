package homework36.city_arrays;
//Сделать пример c классом City, изменить естественную (native) сортировку на сортировку по имени города (по алфавиту)

import java.util.Objects;

public class City implements Comparable<City> {

    // fields
    private String name;
    private int population;
    private String country;
    private double index;

    // constructor
    public City(String name, int population, String country, double index) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return this.name.equals(city.name) && this.country.equals(city.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    @Override
    public int compareTo(City o) {
        return this.name.compareTo(o.name); // native sorting by city name
    }
}