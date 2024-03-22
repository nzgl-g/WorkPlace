/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/Rn16ugyorX0">YouTube Tutorial</a>}
 */
public class E_for_loop {
    public static void main(String[] args) throws InterruptedException {
        // Loop from 10 down to 1, decreasing by 1 each time (i is the changing index)
        for (int i = 10; i >= 1; i -= 1) {
            // Print the current value of i
            System.out.println(i);

            // Pause the program for 1000 milliseconds (1 second) using Thread.sleep
            Thread.sleep(1000); // This is a simple trick to create a delay between prints
        }

        // After the loop is done, print a message
        System.out.println("Happy New Year!"); // This will be printed after the countdown
    }
}
