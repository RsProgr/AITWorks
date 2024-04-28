package classwork.computers.model;

public class Laptop extends Computer1 {
    private double displaySize;
    private double weight;
    private int batteryCapacity; // способность, производительность

    public Laptop(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryCapacity) {
        super(cpu, ram, ssd, brand, price);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Laptop{" +
                "displaySize=" + displaySize +
                ", weight=" + weight +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
