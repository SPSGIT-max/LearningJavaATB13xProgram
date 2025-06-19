package Test_June_19;

import java.util.Scanner;

public class Test13_Print_Tables {
    public static void main(String[] args) {
        int range=10;
        for(int i=1; i<=range; i++)
         {
             System.out.printf("% 4d", i);
         }
        System.out.println();
        System.out.println("---------------------------------------------");
        for (int i = 1; i <= range; i++) {
            System.out.printf("%d |", i);
            for (int j = 1; j <= range; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
