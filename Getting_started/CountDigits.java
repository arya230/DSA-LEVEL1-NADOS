package Getting_started;
import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long count = 0;
        while(n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
    
}
