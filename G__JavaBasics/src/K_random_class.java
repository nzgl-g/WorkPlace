/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/VMZLPl16P5c">YouTube Tutorial</a>}
 */
// Import the Random class from the library
import java.util.Random;

public class K_random_class {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random integer between 0 (inclusive) and 6 (exclusive)
        int x = random.nextInt(6);

        // Print the generated random number
        System.out.println(x);
    }
}
