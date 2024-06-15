package homework35.car;

public class Car implements Comparable<Car>{
    private String brand;
    private int mileage;

    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        int brandComparison = this.brand.compareTo(o.brand);
        if (brandComparison != 0) {
            return brandComparison;
        }
        return Integer.compare(this.mileage, o.mileage);
    }
}

