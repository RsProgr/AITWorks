package homework21.computerShop.controller;

import homework21.computerShop.model.Computer;

import java.math.BigInteger;

public class Stock {
    private Computer[] computers;
    private int count;

    public Stock(int capacity) {
        this.computers = new Computer[capacity];
        this.count = 0;
    }

    public boolean addComputer(Computer computer) {
        if (computer == null || count == computers.length || findComputer(computer.getSerialNumber()) != null) {
            return false;
        }
        computers[count] = computer;
        count++;
        return true;
    }

    private Object findComputer(BigInteger serialNumber) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getSerialNumber().equals(serialNumber)) {
                return computers[i];
            }
        }
        return null;
    }

    public void printComputers() {
        for (int i = 0; i < count; i++) {
            System.out.println(computers[i]);
        }
        System.out.println("=========================");
    }

    public int getCount() {
        return count;
    }

    public Computer removeComputer(BigInteger serialNumber) {
        Computer victim = null;
        for (int i = 0; i < count; i++) {
            if (computers[i].getSerialNumber().equals(serialNumber)) {
                victim = computers[i];
                computers[i] = computers[count - 1];
                computers[count - 1] = null;
                count--;
                break;
            }

        }
        return victim;
    }
}