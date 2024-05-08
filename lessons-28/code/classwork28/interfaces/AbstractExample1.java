package homework28;

abstract class Animal {
    abstract void makeSound();

}

abstract class Creature {
    abstract void walk();
    // множественное наследование в java запрещено
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("meow");
    }
}