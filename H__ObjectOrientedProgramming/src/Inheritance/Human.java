package Inheritance;
public class Human {
    //inheritance is relation between two classes superclass and subclass,the relation called (IS-A)
    /**/
    //ATTRIBUTES DECLARATION
    private String name;
    private int age;
    private double height;
    private String grade;
    /**/

    /**/
    //SETTERS AND GETTERS
    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public String getGrade() {
        return grade;
    }
    /**/

    /**/
    //SET THE CONSTRUCTORS
    public Human(String name, int age, double height, String grade) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.grade = grade;
    }
    public Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human(String name) {
        this.name = name;
    }
    public Human(){}
    /**/

    /**/
    //SUPERCLASS METHODS
    public String eat() {
        return "i am eating,";
    }
    public String sayHello(){
        return "hello younes, ";
    }

    /**/
}
