package ex_04_Java_conditions;

import java.util.Scanner;

public class Lab35_Online_Compiler_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1 :");
        String side1 = scanner.next();
        System.out.println("Enter side2 :");
        String side2 = scanner.next();
        System.out.println("Enter side3 :");
        String side3 = scanner.next();

        if (side1 == side2 && side2 == side3)
        {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1)
        {
            System.out.println("Isosceles triangle");
        } else
        {
            System.out.println("Scalene triangle");
        }
    }
}
