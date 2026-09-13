public class TriangularTest {

    // Determines whether three side lengths can form a valid triangle
    public static boolean isTriangle(double a, double b, double c) {

        // A triangle can't have a zero or negative side length
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        // Triangle inequality theorem: the sum of any two sides must exceed the third side
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        // Parse the three side lengths from the command-line arguments
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // Print whether the three sides form a valid triangle
        System.out.println(isTriangle(a, b, c));

        // Print the three side lengths for reference
        System.out.println(a + " " + b + " " + c);

    }

}