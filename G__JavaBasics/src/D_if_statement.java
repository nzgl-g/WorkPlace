/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/MY03bt_0JQI">YouTube Tutorial</a>}
 */
import java.util.Scanner;

public class D_if_statement {
    public static void main(String[] args) {
        // Declare variables for coefficients and solutions
        double a;
        double b;
        double c;
        double delta;
        double x;
        double y;

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the coefficients of the equation
        System.out.println("Enter the values of the equation coefficients:");
        System.out.print("A: ");
        a = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("B: ");
        b = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("C: ");
        c = scanner.nextDouble();
        scanner.nextLine();

        // Close the scanner to release system resources
        scanner.close();

        // Calculate the discriminant (delta) of the quadratic equation
        delta = Math.pow(b, 2) - (4 * a * c);
        System.out.println("The discriminant (delta) of this equation is: " + delta);

        // Use if-else statements to determine the solutions based on delta
        if (delta > 0) {
            // Two real solutions
            x = (-b - Math.sqrt(delta)) / (2 * a);
            y = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("The first solution of this equation is: " + x);
            System.out.println("The second solution of this equation is: " + y);
        } else if (delta < 0) {
            // No real solutions (complex solutions)
            System.out.println("There are no real solutions for this equation.");
        } else if (delta == 0) {
            // One real solution (repeated root)
            x = -b / (2 * a);
            System.out.println("The solution of this equation is: " + x);
        }
    }
}
