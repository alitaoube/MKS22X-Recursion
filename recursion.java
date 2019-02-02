import java.util.ArrayList;

public class recursion{
  public static void main(String[] args) {
    System.out.println(sqrt(572495742, .5) == Math.sqrt(572495742)) ;
    System.out.println(sqrt(.000003158385, .00014) ==  Math.sqrt(.000003158385));
  }
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return sq(n, tolerance, n / 2);
    }

    public static double sq(double n, double tolerance, double guess){
      System.out.println("n : " + n + ", GUESS: " + guess + ", N DIVIDED BY GUESS SQUARED: " + (n / (guess* guess)) + ", TOLERANCE: " + tolerance);
      if (guess * guess < n && n / (guess*guess) <= tolerance || n / (guess*guess) == 1){
        // System.out.println("HERE");
        return guess;
      }
      return sq(n, tolerance, (n / guess + guess) / 2) ;
    }


    // /*Recursively find the n'th fibbonaci number in linear time
    //  *fib(0) = 1; fib(1) = 1; fib(5) = 5
    //  *precondition: n is non-negative
    //  */
    // public static int fib(int n){
    //
    // }
    //
    // /*As Per classwork*/
    // public static ArrayList<Integer> makeAllSums(){
    // }

}
