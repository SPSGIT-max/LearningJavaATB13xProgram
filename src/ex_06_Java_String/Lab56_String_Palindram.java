package ex_06_Java_String;

import java.util.Scanner;

public class Lab56_String_Palindram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();

        // Normalize to lower case for case-insensitive comparison
        String clean = input.toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();


        if (clean.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }
    }
