package ex_06_Java_String;

import java.util.Scanner;

public class Lab57_String_VowelsCount {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Vowels");
        String input=scanner.nextLine();
        //String input1="Java program to count vowels and conconents";
        int vowels=0;
        int consonents=0;
        input=input.toLowerCase();
        System.out.println(input);
         for(int i=0; i<input.length(); i++)
         {
             char ch=input.charAt(i);
             if(ch =='a' || ch =='i' || ch =='e' || ch =='o'|| ch=='u')
             {
                 vowels++;
             }
             else
             {
                 consonents++;

             }

         }
        System.out.println(vowels);
        System.out.println(consonents);
    }
}
