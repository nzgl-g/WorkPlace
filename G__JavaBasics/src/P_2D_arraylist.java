/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/9tBxJoQF74E">YouTube Tutorial</a>}
 */
import java.util.ArrayList;
import java.util.Scanner;

public class P_2D_arraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a name to your lists: ");
        String name = scan.nextLine();

        // Declaration of the ArrayList of ArrayLists of Strings
        ArrayList<ArrayList<String>> namelist = new ArrayList<>();

        System.out.print("Enter the number of lists you want to create: ");
        int numberlist = scan.nextInt();
        scan.nextLine();

        String[] array = new String[numberlist]; // Array to store names of the lists

        for (int i = 0; i < numberlist; i++) {
            namelist.add(new ArrayList<String>());
            System.out.print("Enter the name of list " + (i + 1) + ": ");
            array[i] = scan.nextLine(); // Store the name of the list

            System.out.print("Enter the number of elements you want to add to list \"" + array[i] + "\": ");
            int numberelement = scan.nextInt();
            scan.nextLine();

            for (int j = 0; j < numberelement; j++) {
                System.out.print("Enter the name of element " + (j + 1) + ": ");
                String element = scan.nextLine();
                namelist.get(i).add(element); // Add the element to the current list
            }
        }

        // Print the contents of each list
        for (int k = 0; k < numberlist; k++) {
            System.out.println("The list " + array[k] + " includes:\n" + namelist.get(k));
        }

        scan.close();
    }
}
