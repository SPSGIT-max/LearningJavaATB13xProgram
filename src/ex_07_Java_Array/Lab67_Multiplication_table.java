package ex_07_Java_Array;

import java.util.Scanner;

public class Lab67_Multiplication_table {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        int tableSize=scanner.nextInt();
         for(int i=0;i<tableSize; i++){
             for (int j=0;j<tableSize;j++){
                 System.out.print(i*j);
             }
             System.out.println();
         }
    }
}
