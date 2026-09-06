public class TriangularTest {
    public static boolean isTriangle(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0){
            return false;
        }
        if (a + b > c && a + c > b && b + c > a){
            return true;

        }else{
            return false;
        }
    

    }

    public static void main(String[] args){

        double a = Double.parseDouble(args[0]);
        double b = DoubleparseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        System.out.println(isTriangle(a, b, c));
        System.out.println(a + " " + b + " " + c);


    }

}