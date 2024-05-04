package classwork27.static_example;

public class Main2 {
    public static void main(String[] args) {
        Car bmw = new Car("bmw", 0);
        Car audi = new Car("audi", 35);
        System.out.println(bmw);
        System.out.println(audi);

        bmw.go(20);
        audi.go(3);
        bmw.go(43);
        audi.go(12);
        bmw.go(52);

        System.out.println(bmw);
        System.out.println(audi);

    }
}
