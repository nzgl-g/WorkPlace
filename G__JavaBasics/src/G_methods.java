/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/v5p_SUfi710">YouTube Tutorial</a>}
 */
public class G_methods {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Declare and initialize two integer variables
        int x = 3;
        int y = 4;

        // Call the 'add' method to add 'x' and 'y', and store the result in 'z'
        int z = add(x, y);

        // Print the result of the addition
        System.out.println(z);
    }

    // Define a method named 'add' that takes two integer parameters and returns an integer
    // Method structure: return type (optional), method name, parameters and their types, instructions, return statement
    static int add(int x, int y) {
        // Perform the addition of 'x' and 'y' and store the result in 'z'
        int z = x + y;

        // Return the result 'z' to the caller
        return z;
    }
}
