package ex_07_Java_Array;

import java.util.Scanner;
import java.util.SortedMap;

public class Lab68_Pyramid_pattern {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=1; i <=n; i++) {
            for (int j=1; j <=n-i; j++) {
                //System.out.print(" ");
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
