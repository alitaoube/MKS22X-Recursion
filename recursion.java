import java.util.ArrayList;

public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return sq(n, tolerance, 1);
    }

    public static double sq(double n, double tolerance, double guess){
      if (guess*guess / n <= tolerance){
        return guess;
      }
      return sq(n, tolerance, ((n / guess + guess) / 2));
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
    }

}
