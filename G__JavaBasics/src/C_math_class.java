/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/w0VTlSOXBs8">YouTube Tutorial</a>}
 */
import java.util.Scanner;

public class C_math_class {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base and height of the triangle
        System.out.println("Enter the base and the height of the triangle.");
        System.out.print("Base: ");

        // Read the base as an integer
        int i = scanner.nextInt();

        // Clear the scanner buffer by reading the newline character
        scanner.nextLine();

        System.out.print("Height: ");

        // Read the height as an integer
        int j = scanner.nextInt();

        // Clear the scanner buffer by reading the newline character
        scanner.nextLine();

        // Declare a variable to store the hypotenuse
        double hypotenuse;

        // Calculate the hypotenuse using the Math class's sqrt method
        // Note: Use Math.pow for exponentiation, not '^' which is a bitwise XOR
        hypotenuse = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));

        // Display the calculated hypotenuse
        System.out.println("The hypotenuse of the triangle is: " + hypotenuse);

        // Close the scanner to release system resources
        scanner.close();
    }
}
