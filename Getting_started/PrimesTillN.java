/*
 1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).
Input Format
low 
high
Output Format
n1
n2
.. all primes between low and high (both included)

Constraints
2 <= low < high < 10 ^ 6
Sample Input
6 
24
Sample Output
7
11
13
17
19
23
*/

package Getting_started;
import java.util.*;
public class PrimesTillN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int low  = in.nextInt();
        int high = in.nextInt();

        for(int n = low; n <= high; n++){
            int count = 0;
            for(int div = 2; div * div <= n; div++) {
                if(n % div == 0) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                System.out.println(n);
            }


        }
    }
    
}
