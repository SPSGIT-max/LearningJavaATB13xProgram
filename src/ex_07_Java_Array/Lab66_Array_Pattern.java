package ex_07_Java_Array;

import java.util.Scanner;

public class Lab66_Array_Pattern {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        //for (int i=0; i < n; i++) {
          //  for (int j=0; j <=i; j++) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

