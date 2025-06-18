package ex_04_Java_conditions;

import java.util.Scanner;

public class Lab_11_character_vowel {
    public static void main(String[] args) {

        System.out.println("enter the character");
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().toLowerCase().charAt(0);
        if(ch == 'a' ||ch=='e'|| ch =='i' || ch =='o' || ch=='u') {
            System.out.println("its vowel");
        }
            else
        {
            System.out.println("its consonant");
        }

    }
}
