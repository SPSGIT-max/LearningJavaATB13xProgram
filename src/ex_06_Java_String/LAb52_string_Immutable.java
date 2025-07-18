package ex_06_Java_String;

public class LAb52_string_Immutable {
    public static void main(String[] args) {
        //Immutable - That can't be change.
        String s1 = "Hello";
        s1.concat("Immutable");
        System.out.println(s1);
        System.out.println("------------Contact absically add the value in the end-------------");

        String s2 = "Hello";
        s2=s2.concat(" Immutable");
        System.out.println(s2);
    }
}
