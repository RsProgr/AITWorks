package homework.pet;

public class HouseAppl {
    private static String voice;

    public static void main(String[] args) {

        Cat cat1 = new Cat(1, "cat", 5, "Vasjka", "Burmese shorthair cat", 20, 6);
        Cat cat2 = new Cat(2, "cat", 5, "Sonja", "Sphinx", 30, 4);
        Cat cat3 = new Cat(3, "cat", 5, "Laska", "Bengal cat", 40, 5);
        Dog dog1 = new Dog(4, "dog", 2, "Aik", "Doberman", 69, 30);
        Dog dog2 = new Dog(5, "dog", 3, "bandit", "DALMATINE", 57, 55);


        cat1.voice();
        cat2.isEating();
        cat3.sleep();
        cat1.isPlay();
        cat2.gnawing();
        cat3.isDrinks();
        cat1.isSitting();
        System.out.println(" ");

        dog1.voice();
        dog1.isPlay();
        dog2.sleep();
        dog1.isSitting();
        dog2.isEating();
    }
}