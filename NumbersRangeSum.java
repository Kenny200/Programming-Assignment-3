public class NumbersRangeSum {
    // Recursive method to calculate the sum of all integers from a to b (inclusive)
    public static long getSum(int a, int b){
        if (a == b) return b;//base case
        return a + getSum(a + 1, b);//recursion case

    }

    public static void main(String[] args){
        // Parse the command-line arguments into the lower and upper bounds of the range
        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);
        // Compute the sum of numbers in the range [low, high]
        long sum = getSum(low, high);
        // Build a string representation of the range for display purposes
        String range = "[" + args[0] + "," + args[1] + "]";
        // Print the result to the console
        System.out.println("The sum of natural numbers in range " + range + " is " + sum + ".");

    }
    
}
