package homework.pet.model;

public class PetAppl {
    public static void main(String[] args) {


        Pet p1 = new Pet(1, "Cat", 5, "Boomer");
        Pet p2 = new Pet(2, "dog", 3, "Zinger");
        Pet p3 = new Pet(3, "snake", 2, "Eva");
        Pet p4 = new Pet(4, "parrot", 6, "Borja");
        Pet p5 = new Pet(5, "spider", 2, "Luna");

        p1.sleep();
        p2.isPlay();
        p3.makeSound();
        p4.isEating();
        p5.isWalk();
    }
}