/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/Om3qzMoaIUo">YouTube Tutorial</a>}
 */
import java.util.Scanner;

public class J_switches {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a day in French and read the input
        System.out.print("Enter a day in French: ");
        String day = scanner.nextLine();

        // Close the scanner to release system resources
        scanner.close();

        // Use a switch statement to match the entered day and print the corresponding number
        switch (day) {
            case "samdi":
                System.out.println("It is " + 1);
                break;
            case "dimanche":
                System.out.println("It is " + 2);
                break;
            case "lundi":
                System.out.println("It is " + 3);
                break;
            case "mardi":
                System.out.println("It is " + 4);
                break;
            case "marcredi":
                System.out.println("It is " + 5);
                break;
            case "jeudi":
                System.out.println("It is " + 6);
                break;
            case "vendredi":
                System.out.println("It is " + 7);
                break;
            default:
                System.out.println("That is not a day");
        }
    }
}
