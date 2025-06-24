package ex_05_Java_User_Input;

import java.util.Scanner;

public class Lab31_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first side length");
        int side1=scanner.nextInt();
        System.out.println("Enter second side length");
        int side2=scanner.nextInt();
        System.out.println("Enter third side length");
        int side3=scanner.nextInt();
        if (side1 == side2 && side2 == side3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }

    }
}
