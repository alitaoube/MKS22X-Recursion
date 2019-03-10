import java.util.ArrayList;

public class recursion{

  public static boolean closeEnough(double a, double b){
    if(a==0.0 && b==0.0)return true;
    if(a==0.0)return b < 0.00000000001;
    if(b==0.0)return a < 0.00000000001;
    return Math.abs(a-b)/a < 0.0001;//This is the normal % difference allowed

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
      if (n == 0) return 0;

      if (Math.abs(n - Math.pow(guess, 2)) < tolerance * n) {
        return guess;
      }
      return sq(n, tolerance, (n / guess + guess) / 2) ;
    }


    // /*Recursively find the n'th fibbonaci number in linear time
    //  *fib(0) = 1; fib(1) = 1; fib(5) = 5
    //  *precondition: n is non-negative
    //  */
    public static int fib(int n){
      if (n <= 1){
        return n;
      }
      return fib(n-2) + fib(n-1);
    }
    //
    // /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> output = new ArrayList<Integer>();
      return mSum(n, 0, output);
    }

    public static ArrayList<Integer> mSum(int n, int start, ArrayList<Integer> output){
      if (n == 0){
        output.add(start);
      }

      if (n > 0){
        n--;
        mSum(n, start + n + 1, output);
        mSum(n, start, output);
      }

      return output;

    }

}
