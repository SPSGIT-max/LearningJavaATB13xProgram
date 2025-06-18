package ex_04_Java_conditions;

import java.util.Scanner;

public class Lab_12_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter valid year");
        int year=scanner.nextInt();

        if(year<=0)
        {
            System.out.println("enter a year greater than 0.");
        }
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("it's a Leap Year");
        }
            else
        {
            System.out.println("It's not a Leap Year");
        }
    }
}
