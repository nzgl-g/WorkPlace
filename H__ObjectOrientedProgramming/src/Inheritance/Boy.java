package Inheritance;
//when we want to use a SUPERCLASS,we must use the extends modifier
 public class Boy extends Human {

	 /**/
	 //ATTRIBUTES DECLARATION
	 private boolean wantToMilitaryArmy;
	 /**/

	 /**/
	 //SETTERS AND GETTERS
	 //setters
	 public void setWantToMilitaryArmy(boolean wantToMilitaryArmy) {
		 this.wantToMilitaryArmy = wantToMilitaryArmy;
	 }
	 //getters
	public boolean isWantToMilitaryArmy() {
		return wantToMilitaryArmy;
	}
	/**/

	/**/
	//CREATE A CONSTRUCTOR IN THE SUBCLASS
	//IMPORTANT ! : when you want to creat a constructor in the SUBCLASS  you need to use the SUPERCLASS parameters
	//here we can't creat a constructor of one parameter wantToMilitaryArmy ,
	public Boy(String name, int age, double height, String grade, boolean wantToMilitaryArmy) {//we must use the SUPERCLASS parameters
		super(name, age, height, grade);
		this.wantToMilitaryArmy = wantToMilitaryArmy;
	}//5 parameters

	public Boy(String name, int age, double height, String grade) {
		super(name, age, height, grade);
	}//4 parameters

	public Boy(String name, int age, double height) {
		super(name, age, height);
	}//3 parameters

	public Boy(String name, int age) {
		super(name, age);
	}//2 parameters

	public Boy(String name) {
		super(name);
	}//1 parameters
	public Boy(){}//0 parameter because there is an empty constructor in the SUPERCLASS
	/**/

	 /**/
	 //OVERRIDING METHODS
	@Override //means let me use the function with my way
	public String eat() {
		//super.eat(); //this is to use the function eat in the SUPERCLASS / if we remove this instruction,the function eat in the SUPERCLASS will be off
		return super.eat()+"because i'm a boy";// + the methode eat in the SUBCLASS
	}
	public String helloName(){//we don't need to use @Override because we change the name of the methode

		return super.sayHello()+"i am a boy";
	}
	/**/
 }

