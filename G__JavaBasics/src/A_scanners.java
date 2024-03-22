/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/wAEPokhj5Q4">YouTube Tutorial</a>}
 */
// Import the necessary library for using Scanner
import java.util.Scanner;

public class A_scanners {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store different types of input
        int i;       // for an integer
        String j;    // for a string
        char x;      // for a character
        double y;    // for a double

        // Prompt the user to enter a number and read it as an integer
        System.out.print("Please enter a number: ");
        i = scanner.nextInt();

        // Clear the scanner buffer by reading the newline character
        scanner.nextLine();

        // Prompt the user to enter a string and read it as a line
        System.out.print("Please enter a string: ");
        j = scanner.nextLine();

        // Prompt the user to enter a character and read it
        System.out.print("Please enter a character: ");
        x = scanner.next().charAt(0);

        // Clear the scanner buffer by reading the newline character
        scanner.nextLine();

        // Prompt the user to enter a double and read it
        System.out.print("Please enter a double: ");
        y = scanner.nextDouble();

        // Clear the scanner buffer by reading the newline character
        scanner.nextLine();

        // Display the input values
        System.out.println("You entered the number: " + i);
        System.out.println("You entered the string: " + j);
        System.out.println("You entered the character: " + x);
        System.out.println("You entered the double: " + y);

        // Close the scanner to release system resources
        scanner.close();
    }
}
