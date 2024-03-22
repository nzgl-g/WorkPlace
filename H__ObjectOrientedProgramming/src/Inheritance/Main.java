package Inheritance;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Boy b1 =new Boy();
		Girl g1 =new Girl();
		System.out.print("are you  boy or girl :? ");String userInput=scan.nextLine();
		boolean result1=userInput.equalsIgnoreCase("boy");
		boolean result2=userInput.equalsIgnoreCase("girl");
		if (result1) {
			System.out.println(b1.eat());
			System.out.println(b1.helloName());
		}
		else{
			if (result2){
			System.out.println(g1.eat());
			System.out.println(g1.sayHello("houda"));
		}}
		scan.close();
	}
}

