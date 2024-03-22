package OOP_basics;

public class Car {

	//default constructor// جديد constructor افتراضي طالما لم يشكل
	//attributes صفات
	int speed;
	protected String color="white";
	String model;
	//default constructor
	//to declare a constructor we don't need to put the return type
	public Car(/*parameters*/){//this is a constructor
		/*when you declare a constructor you must declare an empty constructor to use it(default constructor d'on't work in this case)*/
	}
	//constructor with model
	public Car(/*parameters*/String model/*this model is not the same with the model declared in the begging*/){
		this.model=model;
	}
	//constructor with model and speed
	public Car(String model, int speed ) {
		this.speed=speed;
		this.model=model;
	}
	//constructor with speed and model and color
	public Car(String model, int speed, String color) {
		this.speed=speed;
		this.model=model;
		this.color=color;
	}
	//methodes أفعال
	public void turnOn(){
		System.out.println("car is being turned ON now");
	}
	public void brake() {
		System.out.println("car is brake");
	}
	void accilurate() {
		System.out.println("car is accilurate");
	}
	void turnOff() {
		System.out.println("car is being turned off");
	}
	void model() {
		System.out.println(model);
	}
}
