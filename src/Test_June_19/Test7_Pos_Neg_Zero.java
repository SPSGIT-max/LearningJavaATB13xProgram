package Test_June_19;

import java.util.Scanner;

public class Test7_Pos_Neg_Zero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int i=scanner.nextInt();

        if(i<0)
        {
            System.out.println("its a negetive number: "+i);
    } else if (i==0) {
            System.out.println("its a zero number");
        }
        else
        {
            System.out.println("its positive number");
        }

        }
    }
