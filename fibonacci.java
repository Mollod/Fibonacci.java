import java.util.*;

public class GFG
{
// Function to print the fibonacci
// series in reverse order.

static void fibo(int n, int a, int b)
{

    if (n > 0) {
 

        // Function call

        fibo(n - 1, b, a + b);
 

        // Print the result

        System.out.print(a + " ");

    }
}
 
// Driver Code

public static void main(String args[])
{

    int N = 10;

    fibo(N, 0, 1);
}
}
// Contributed by David Ramollo
  