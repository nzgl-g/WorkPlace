/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/P9hEmbfdiuc">YouTube Tutorial</a>}
 */
public class I_string_methods {
    public static void main(String[] args) {
        // Define a string named 'name'
        String name = " younes habbal";

        // Use various String methods to manipulate and analyze the string
        // Method 1: Check if 'name' is equal to " YOUNES HABBAL" (case-insensitive)
        boolean result1 = name.equalsIgnoreCase(" YOUNES HABBAL");

        // Method 2: Get the length of the string
        int result2 = name.length();

        // Method 3: Get the character at index 1 (0-based index)
        char result3 = name.charAt(1);

        // Method 4: Find the first occurrence of 'o' in the string and return its index
        int result4 = name.indexOf("o");

        // Method 5: Check if 'name' is an empty string (length is equal to 0)
        boolean result5 = name.isEmpty();

        // Method 6: Convert 'name' to uppercase
        String result6 = name.toUpperCase();

        // Method 7: Convert 'name' to lowercase
        String result7 = name.toLowerCase();

        // Method 8: Remove leading and trailing spaces from 'name'
        String result8 = name.trim();

        // Method 9: Replace all occurrences of 'o' with 'a' in 'name'
        String result9 = name.replace('o', 'a');

        // Print the results
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
    }
}
