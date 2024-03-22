package Abstraction.Inteface;

public class Main {
    public static void main(String[] args){
        Dog dog1=new Dog();
        dog1.setAnimalcaneat(true);
        System.out.println(dog1.isAnimalcaneat());
        dog1.walk();
    }
}
