package homework28.car;

import java.util.Arrays;

public class CarArrayList implements ArrayList {
    private static final int INITIAL_CAPACITY = 10;
    private Car[] elements;
    private int size;

    public CarArrayList() {
        elements = new Car[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void add(Car value) {
        ensureCapacity();
        elements[size] = value;
        size++;
    }

    @Override
    public Car get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds!");
        }
        return elements[index];
    }

    @Override
    public Car remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds!");
        }
        Car removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return removedElement;
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    public int size() {
        return size;
    }
}