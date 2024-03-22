/**
 *  You can watch a video tutorial on this program here:
 *   {@link <a href="https://youtu.be/kArGE1-vRrw">YouTube Tutorial</a>}
 */
public class H_overloaded_methods {
    // Main class section
    public static void main(String[] args) {
        // Call the overloaded methods and store their results in variables
        double a = add(1.0, 2.0);
        double b = add(1.0, 2.0, 3.0);
        double c = add(1.0, 2.0, 3.0, 4.0);
        int d = add(1, 2, 3, 4);
        int e = add(1, 2, 3);
        int f = add(1, 2);

        // Print the results
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    /* Overloaded methods section */
    // Overloaded methods share the same name but have different parameters

    // Overloaded method #1
    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    // Overloaded method #2
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    // Overloaded method #3
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }

    // Overloaded method #4
    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }

    // Overloaded method #5
    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }

    // Overloaded method #6
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }
}
