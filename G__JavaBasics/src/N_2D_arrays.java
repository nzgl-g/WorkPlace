/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/alwukGslBG8">YouTube Tutorial</a>}
 */
import java.util.Scanner;

public class N_2D_arrays {
    public static void main(String[] args) throws InterruptedException {
        // This example demonstrates how to create and populate a 2D matrix (array)
        System.out.println("This example shows how to create a matrix.");
        System.out.println("Enter the dimensions of the matrix.");

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows (lines) and columns
        System.out.print("Rows: ");
        int rows = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Columns: ");
        int columns = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create a 2D array (matrix) with the specified dimensions
        Integer[][] matrix = new Integer[rows][columns];

        // Use nested loops to fill the matrix with values provided by the user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Row[" + i + "], Column[" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            }
        }

        // Close the scanner to release system resources
        scanner.close();

        // Pause the program for a moment (1 second)
        Thread.sleep(1000);

        // Display the content of the matrix
        System.out.println("Content of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Thread.sleep(1000);
                System.out.println("Row[" + i + "], Column[" + j + "] = " + matrix[i][j]);
            }
        }
    }
}
