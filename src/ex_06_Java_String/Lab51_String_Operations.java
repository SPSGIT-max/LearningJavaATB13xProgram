package ex_06_Java_String;

public class Lab51_String_Operations {
    public static void main(String[] args) {
        //Two ways string can be created
        //1st way
        String s1="Hello ";
        //2nd way
        String s2= new String ("World");
        s1=s1.toUpperCase();
        System.out.println(s1);
        String strcon=s1.concat(s2);
        System.out.println(strcon);

        //length
        System.out.println("string length "+ strcon.length());
        //substringW
        System.out.println("Substring "+ s1.substring(1));
        //character extraction
        System.out.println("Character extraction "+ s2.charAt(3));
    }
}
