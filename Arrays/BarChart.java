package Arrays;
import java.util.Scanner;
public class BarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        barChart(arr);
    }

    public static void barChart(int []arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max  = arr[i];

        }
    }
    for(int i = max; i >= 1; i--) {
        for(int j = 0; j < arr.length; j++) {
            if(i > arr[j]) {
            System.out.print("\t");
        }
        else {
            System.out.print("*\t");
        }
    }
    System.out.println();

    }
}
}




