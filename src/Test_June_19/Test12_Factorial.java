package Test_June_19;

import java.util.Scanner;

public class Test12_Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=scanner.nextInt();
        long Factorial = 1;
        int i=number;
        while(i>1) {
            Factorial *= i;
            i--;
        }
            System.out.println("Factorial of "+number+" number is: "+Factorial);
            scanner.close();
        }

    }

