package Patterns;
import java.util.*;
public class P1 { 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        
        //for the no of rows
        for(int i = 1; i <= n; i++) {
            //for the no of stars
            for(int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            nst++;
            System.out.println();
        }

    }
    
}
