/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/ei_4Nt7XWOw">YouTube Tutorial</a>}
 */
import java.util.Scanner;

public class M_arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word to separate into characters
        System.out.print("Enter the word to separate: ");

        // Read the user's input as a string
        String word = scanner.nextLine();

        // Close the scanner to release system resources
        scanner.close();

        // Create an array of strings to store individual characters
        String[] character = new String[word.length()];

        // Use a loop to separate the word into characters and store them in the array
        for (int i = 0; i < word.length(); i++) {
            character[i] = String.valueOf(word.charAt(i));
        }

        // Use another loop to print each character from the array
        for (int j = 0; j < word.length(); j++) {
            System.out.println(character[j]);
        }
    }
}
