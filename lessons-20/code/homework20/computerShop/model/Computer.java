package homework20.computerShop.model;

import java.util.Objects;


public class Computer {
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private String serialNumber;

    public Computer(String cpu, int ram, int ssd, String brand, String serialNumber) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;

        this.serialNumber = checkSerialNumber(serialNumber);
    }

    private String checkSerialNumber(String serialNumber) {
        if(serialNumber.length() == 20 && countDigits(serialNumber) == 20){
            return serialNumber;
        }
        return null;

    }

    private int countDigits(String serialNumber) {
        int count = 0;
        for (int i = 0; i < serialNumber.length(); i++) {
            char c = serialNumber.charAt(i);
            if(Character.isDigit(c)) {
                count++;
            }

        }

        return count;
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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand) && Objects.equals(serialNumber, computer.serialNumber);
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