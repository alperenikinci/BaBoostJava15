package week06.day02.abstraction;

public class Dog extends PetAnimal{

//    private String renk;

    //init -> Constructor'dan once calisir.
    {
       eat();
    }

//    public Dog(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

//    public Dog(String name, int age, String renk) {
//        super(name, age);
//        this.renk = renk;
//    }


    public Dog(String name, int age) {
        super(name, age);
    }

    public void bringTheStick(){
        System.out.println("Stick has been thrown...");
        System.out.println(name + " is bringing the stick...");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " is barking...");
    }


}
