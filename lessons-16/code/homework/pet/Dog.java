package homework.pet;

import homework.pet.model.Pet;

public class Dog extends Pet {
    private String breed;
    private double height;

    private double weight;

    public Dog(int id, String kindName, int age, String nickName, String breed, double height, double weight) {
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
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void voice() {

        System.out.println("Bow-wow");
    }
}