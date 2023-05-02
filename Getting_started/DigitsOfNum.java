/* 
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
Input Format
"n" where n is any integer.
Output Format
d1
d2
d3
... digits of the number
Constraints
1 <= n < 10^9
Sample Input
65784383
Sample Output
6
5
7
8
4
3
8
3
*/
package Getting_started;
import java.util.*;
public class DigitsOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        int nod = 0;
        while(temp > 0) {
            temp = temp / 10;
            nod++;

        }
        int div = (int)Math.pow(nod - 1);
        

    }
    
}
