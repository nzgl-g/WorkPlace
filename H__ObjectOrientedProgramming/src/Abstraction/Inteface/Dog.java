package Abstraction.Inteface;

public class Dog extends Cat implements Animal, Animal2 {//here we can inheritance from the interface and the class

//here in this exemple we can don't set the implementation of the function in the interface here in the subclass because we extends from superclass
    /*@Override
    public void eat() {
        System.out.println("the dog is eating");
    }
    @Override
    public void drink() {
        System.out.println("the dog is drinking");
    }
    @Override
    public void walk() {
        System.out.println("the dog is walking ");
    }*/
}
