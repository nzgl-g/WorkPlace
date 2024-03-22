package Abstraction.Inteface;

public class Cat implements Animal {
    private String AnimalColor;
    private boolean isAnimalcaneat;
    private boolean isAnimalcanwalk;

    public String getAnimalColor() {
        return AnimalColor;
    }

    public void setAnimalColor(String animalColor) {
        AnimalColor = animalColor;
    }

    public boolean isAnimalcaneat() {
        return isAnimalcaneat;
    }

    public void setAnimalcaneat(boolean animalcaneat) {
        isAnimalcaneat = animalcaneat;
    }

    public boolean isAnimalcanwalk() {
        return isAnimalcanwalk;
    }

    public void setAnimalcanwalk(boolean animalcanwalk) {
        isAnimalcanwalk = animalcanwalk;
    }
    //important : when you implement from the interface you must set the implementation of the function in the interface here in the subclass
    @Override
    public void eat() {
        System.out.println("the cat is eating");
    }

    @Override
    public void drink() {
        System.out.println("the cat is eating");
    }

    @Override
    public void walk() {
        System.out.println("the cat is eating");
    }
}
