/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/1nRj4ALuw7A">YouTube Tutorial</a>}
 */
import java.util.ArrayList;
import java.util.Scanner;

public class O_arraylist {
    public static void main(String[] args) {
        // Display introductory messages
        System.out.println("In this example, we try to replicate the ArrayList class");
        System.out.println("Enter the list of home supplies:");

        // Create an ArrayList to store home supplies
        ArrayList<String> supplies = new ArrayList<>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        int j = 1; // Counter for the elements

        // Start an indefinite loop to continuously add supplies
        while (true) {
            // Prompt the user to enter a supply
            System.out.print("Element " + j + ": ");
            String supply = scanner.nextLine();

            // Add the supply to the ArrayList
            supplies.add(supply);

            // Ask the user if they want to add more supplies
            System.out.print("Do you want to add more supplies (yes/no): ");
            String response = scanner.nextLine();

            // Check if the response is not "yes" (case-insensitive)
            if (!response.equalsIgnoreCase("yes")) {
                break; // Exit the loop if the response is not "yes"
            }

            j++; // Increment the element counter
        }

        // Close the Scanner to release system resources
        scanner.close();

        // Display the list of home supplies
        System.out.println("Home Supplies List:");
        for (String supply : supplies) {
            System.out.println(supply);
        }
    }
}
