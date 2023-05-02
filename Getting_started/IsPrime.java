/*1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
Input Format
A number t
A number n
A number n
.. t number of times
Output Format
prime
not prime
not prime
.. t number of times

Constraints

1 <= t <= 10000
2 <= n < 10^9

Sample Input

5
13
2
3
4
5
Sample Output

prime
prime
prime
not prime
prime
*/


package Getting_started;

import java.util.*;
public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 1; i <= t; i++) {
            int n = in.nextInt();
            boolean isPrime = true;
            for(int div = 2; div * div <= n; div++) {
                if(n % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime == true) {
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }

    }
    
}
