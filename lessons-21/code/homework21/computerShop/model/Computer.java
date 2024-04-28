package homework21.computerShop.model;
/*
Задание 1. Исправить Stock - Computer - ComputerShop так,
чтобы можно было использовать msn с длиной 20 цифр (BigInteger).
*/


import java.math.BigInteger;
import java.util.Objects;


public class Computer {
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private BigInteger serialNumber;

    public Computer(String cpu, int ram, int ssd, String brand, BigInteger serialNumber) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(BigInteger serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand) && Objects.equals(serialNumber, computer.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand, serialNumber);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

}