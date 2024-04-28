package homework.pet;
/*
Задача 1. Создайте дочерние от класса Pet классы Cat и Dog
c дополнительными полями: порода, рост, вес.
Создайте метод voice, который выдает "Мяу!"
для класса Cat и  "Гав-гав!" для класса Dog.
Создайте HouseAppl, в котором есть метод main.
Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.
*/


import homework.pet.model.Pet;

public class Cat extends Pet {
    private String breed;
    private double height;
    private double weight;

    public Cat(int id, String kindName, int age, String nickName, String breed, double height, double weight) {
        super(id, kindName, age, nickName);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void voice() {
        System.out.println("meow");

    }
}