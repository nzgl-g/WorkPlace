public class S_continue_statement {
    public static void main(String[] args) {
        // Unlabeled continue statement

        // Define a string named 'searchMe'.
        String searchMe = "hey i'm younes habbal" + " i study computer science ";

        // Initialize a variable 'numPs' to count the occurrences of 'e'.
        int numPs = 0;

        // Use a for loop to iterate through the characters in 'searchMe'.
        for (int i = 0; i < searchMe.length(); i++) {
            // Check if the current character is not 'e'.
            if (searchMe.charAt(i) != 'e') {
                // Use the 'continue' statement to skip the rest of the loop body and go to the next iteration.
                continue;
            }
            // If 'e' is found, increment 'numPs'.
            numPs++;
        }

        // Print the total number of 'e's found in the string.
        System.out.println("Total number of 'e's found in the string: " + numPs);

        // Labeled continue statement

        // Define a string 'searchme' and a substring 'substring'.
        String searchme = "Look for a substring in me";
        String substring = "sub";

        // Initialize a boolean variable 'foundIt' to track if the substring is found.
        boolean foundIt = false;

        // Calculate the maximum index to start searching for the substring.
        int max = searchme.length() - substring.length();

        // Define a label 'test' for the outer loop.
        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;

            // Use a while loop to compare characters in 'searchme' and 'substring'.
            while (n-- != 0) {
                if (searchme.charAt(j++) != substring.charAt(k++)) {
                    // If characters don't match, use 'continue test' to skip to the next iteration of the outer loop.
                    continue test;
                }
            }

            // If the loop completes without a mismatch, set 'foundIt' to true and break out of the labeled loop.
            foundIt = true;
            break test;
        }

        // Print whether the substring was found.
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}
