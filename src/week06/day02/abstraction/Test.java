package week06.day02.abstraction;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Köpke",3);
        dog.makeSound();
        dog.eat();
        dog.bringTheStick();
        dog.sleep();
        
        Cat cat = new Cat("keddy",2);
        cat.makeSound();
        cat.eat();
        cat.playWithWoolBall();
        cat.sleep();

    }
}
