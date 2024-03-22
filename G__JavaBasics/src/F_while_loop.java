/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/t6gmQaTMTtM">YouTube Tutorial</a>}
 */
import java.util.Scanner;

public class F_while_loop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Initialize the 'name' variable as an empty string
        String name = "";

        // Use a while loop with the condition that 'name' is blank (empty or contains only whitespace)
        while (name.isBlank()) {
            // Prompt the user to enter their name
            System.out.print("Enter your name: ");

            // Read the user's input as a line and assign it to the 'name' variable
            name = scanner.nextLine();
        }

        // Check if the 'name' is not blank and print it
        System.out.println("Your name is " + name);

        // Close the scanner to release system resources
        scanner.close();
    }
}
