public class NumbersRangeSum {
    public static long getSum(int a, int b){
        if (a == b) return b;//base case
        return a + getSum(a + 1, b);//recursion

    }

    public static void main(String[] args){

        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);
        long sum = getSum(low, high);
        String range = "[" + args[0] + "," + args[1] + "]";

        System.out.println("The sum of natural numbers in range " + range + " is " + sum + ".");

    }
    
}
