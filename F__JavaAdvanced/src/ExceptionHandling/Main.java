package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("this program calculate the deivision");
            System.out.print("enter the first number=? ");
            int x= scan.nextInt();
            scan.nextLine();
            System.out.print("enter the second number=? ");
            int y=scan.nextInt();
            scan.nextLine();
            int z=(x/y);
            System.out.println("the result is = "+z);
            scan.close();}
        catch (ArithmeticException exception){
            System.out.println("you can't devide by 0 . IDIOT:( !");}
        catch (InputMismatchException exception){
            System.out.println("please enter an integer. STUPID :( !");}
        finally {
            System.out.println("you used the devision operation");}
    }}

