package homework35.car;

import java.util.Objects;

public class Car implements Comparable<Car>{

    private String brand;
    private String model;
    private int yearOfManufacture;
    private int mileage;
    private int price;


    public Car(String brand, String model, int yearOfManufacture, int mileage, int price) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = mileage;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return yearOfManufacture == car.yearOfManufacture && mileage == car.mileage && price == car.price && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfManufacture, mileage, price);
    }

    @Override
    public int compareTo(Car o) {
        int res = this.brand.compareTo(o.brand); // сортировка по бренду (по алфавиту)
        if (res != 0) { // если бренды НЕ совпали
            return res; // вернули результат сравнения
        } else {
            // res = Integer.compare(this.mileage, o.mileage); // иначе сортируем по пробегу
            res = (this.mileage - o.mileage);
        }
        return res;
    }

}