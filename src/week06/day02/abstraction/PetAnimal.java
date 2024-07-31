package week06.day02.abstraction;

public abstract class PetAnimal {

    protected String name;
    protected int age;


    public PetAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void eat(){
        System.out.println(name + " is eating...");
    }
    public void sleep(){
        System.out.println(name + " is sleeping...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PetAnimal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
