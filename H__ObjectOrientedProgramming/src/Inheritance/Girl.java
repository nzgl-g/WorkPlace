package Inheritance;
public class Girl extends Human {
	/**/
	//ATTRIBUTES DECLARATION
	private boolean married;
	/**/

	/**/
	//SETTER QND GETERS
	//setters
	public Girl setMarried(boolean married) {
		this.married = married;
		return this;
	}
	//getters
	public boolean isMarried() {
		return married;
	}
	/**/

	/**/
	//CREATE A CONSTRUCTOR IN THE SUBCLASS

	public Girl(String name, int age, double height, String grade, boolean married) {
		super(name, age, height, grade);
		this.married = married;
	}//5 parameters

	public Girl(String name, int age, double height, String grade) {
		super(name, age, height, grade);
	}//4 parameters

	public Girl(String name, int age, double height) {
		super(name, age, height);
	}//3 parameters

	public Girl(String name, int age) {
		super(name, age);
	}//2 parameters

	public Girl(String name) {
		super(name);
	}//1 parameters
	public Girl(){}//0 parameter
	/**/

	/**/
	public String eat() {

		return super.eat()+"because i'm a girl";
	}
	public String sayHello(String girlName) {

		return super.sayHello()+"i am "+girlName;
	}
	/**/
}
