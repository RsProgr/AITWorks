package classwork24;


abstract class Animal {
    abstract void makeSound();

    void breathe() {
        System.out.println("Animal is breathing");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("muuuuuuuuuuu");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("woof");
    }

    void swim() {
        System.out.println("Dog is swimming");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("meow");
    }
}
abstract class AnimalInSy extends Animal {
   void fly(){
        System.out.println("Animal is skying");
    }
}
abstract class Bird extends AnimalInSy{
    @Override
    void makeSound() {
        System.out.println("chirik-chirick");
    }
}

class AbstractExample {
    public static void main(String[] args) {
       Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Animal[] animals = {dog, cat, cow};
        for(Animal animal: animals){
            animal.makeSound();
        }

// Animal animal = new Animal(); у abstract нельзя так делать
        dog.makeSound();
        cat.makeSound();
        dog.breathe();
        cat.breathe();
        cow.makeSound();



    }
}
class AbstractExample2{
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow(), new Bird() {
        }};
        for(Animal animal : animals){
            animal.makeSound();
        }
    }
}