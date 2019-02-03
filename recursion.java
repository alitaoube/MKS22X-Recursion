import java.util.ArrayList;

public class recursion{
  public static void main(String[] args) {

    System.out.println(sqrt(572495742, .0000000000001) == Math.sqrt(572495742) ) ;
    System.out.println(Math.sqrt(572495742));
    System.out.println(sqrt(572495742, .0000000000001));

    System.out.println();

    System.out.println(sqrt(51458921, .1) == Math.sqrt(51458921));
    System.out.println(sqrt(51458921, .1));
    System.out.println(Math.sqrt(51458921));



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

      if (Math.abs(n - Math.pow(guess, 2)) < tolerance * n) {
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
