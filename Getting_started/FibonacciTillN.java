/*
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.
Input Format
n
Output Format
0
1
1
2
3
5
8
.. first n fibonaccis


Constraints
1 <= n < 40
Sample Input
10
Sample Output
0
1
1
2
3
5
8
*/
package Getting_started;
import java.util.*;
public class FibonacciTillN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++) {
            int c =  a + b;
            System.out.println(a);
            a = b;
            b = c;


        }

    }
}