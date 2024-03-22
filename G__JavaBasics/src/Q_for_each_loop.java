import java.util.ArrayList;

public class Q_for_each_loop {
    public static void main(String[] args) {
        // Declare an array of integers named 'values' and initialize it with some values.
        int[] values = {1, 2, 3, 4, 5, 6};

        // Use a for-each loop to iterate through each element (value) in the 'values' array.
        // The loop variable 'value' will take on the value of each element in the array, one at a time.
        for (int value : values) {
            // Inside the loop, print the current value along with a message.
            System.out.println("the count is: " + value);
        }

        // You can also use the for-each loop with ArrayLists.
        ArrayList<String> lists = new ArrayList<>();
        lists.add("first");
        lists.add("second");
        lists.add("third");
        lists.add("fourth");

        // Use a for-each loop to iterate through each element (value) in the 'lists' ArrayList.
        // The loop variable 'value' will take on the value of each element in the ArrayList, one at a time.
        for (String value : lists) {
            // Inside the loop, print the current value along with a message.
            System.out.println("the position is: " + value);
        }
    }
}
