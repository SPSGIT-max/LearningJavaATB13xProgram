package ex_06_Java_String;

public class Lab51_String_Operations {
    public static void main(String[] args) {
        String s1="Hello ";
        String s2="World";
        String strcon=s1.concat(s2);
        System.out.println(strcon);

        //length
        System.out.println("string length "+ strcon.length());
        //substring
        System.out.println("Substring "+ s1.substring(1));
        //character extraction
        System.out.println("Character extraction "+ s2.charAt(3));
    }
}
