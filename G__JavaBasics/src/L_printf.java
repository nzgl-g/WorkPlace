/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/c2B_Av3x65s">YouTube Tutorial</a>}
 */
public class L_printf {
    public static void main(String[] args) {
        // printf() is used to format and display text with specific formatting

        // Declare variables of different data types
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        /* [conversion-character] */
        // %b: Format as boolean
        System.out.printf("%b", myBoolean);

        // %c: Format as character
        System.out.printf("%c", myChar);

        // %s: Format as a string
        System.out.printf("%s", myString);

        // %d: Format as an integer
        System.out.printf("%d", myInt);

        // %f: Format as a floating-point number
        System.out.printf("%f", myDouble);

        /* [width] */
        // Set a minimum width of 10 characters for the string
        System.out.printf("Hello %10s", myString);

        /* [precision] */
        // Set precision to 1 digit for the floating-point number
        System.out.printf("You have this much money %.1f", myDouble);

        /* [flags] */
        // - : Left-justify
        // + : Output a plus (+) or minus (-) sign for numeric values
        // 0 : Numeric values are zero-padded
        // , : Comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %,f", myDouble);
    }
}
