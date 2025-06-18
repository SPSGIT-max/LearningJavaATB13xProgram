package ex_04_Java_conditions;

import java.util.Scanner;

public class Lab_13_gradeCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number between 0 to 100");
        int score=scanner.nextInt();

        if(score<0 || score>100)
        {
            System.out.println("Entered number is not in the range of 0 to 100, please enter correct number");
        } else if (score>=90)
        {
            System.out.println("Grade A");
        } else if (score>=80)
        {
            System.out.println("Grade B");
        } else if (score>=70)
        {
            System.out.println("Grade C");
        } else if (score>=60)
        {
            System.out.println("Grade D");
        } else if ((score<=59) && (score>=0))
        {
            System.out.println("Grade F");
        }
    }
}
