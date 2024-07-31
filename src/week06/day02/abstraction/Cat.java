package week06.day02.abstraction;

public class Cat extends PetAnimal{

//    public Cat(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void playWithWoolBall(){
        System.out.println(name + " is playing with wool ball...");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " is Meowing...");
    }
}
