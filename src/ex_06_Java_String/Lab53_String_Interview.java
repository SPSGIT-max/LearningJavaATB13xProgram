package ex_06_Java_String;

public class Lab53_String_Interview {
    public static void main(String[] args) {
        //Interview Question 1
        System.out.println("Interview Question 1");
        String s1="Suresh"; //1
        s1.toUpperCase();
        System.out.println(s1);
        s1=s1.toUpperCase(); //1
        System.out.println(s1);
        System.out.println("How many strings are present in the above code, Answer is 2");

        //Interview Question 2
        System.out.println("Interview Question 2");
        String s2="Hello";
        String s3="Hello";
        String s4="Hello";
        String s5="Hello";
        System.out.println("How Strings are present is String constant pool, Answer is only 1 because value hello once created it consider the same, string is immutable in nature");

        //Interview Question 3
        System.out.println("Interview Question 3");
        String s6=new String("India");
        String s7=new String("India");
        String s8=new String("india");
        System.out.println("How many strings are present in String Constant Pool(SCP), Answer is 1 and how many are present in Object Area(OA) Answer is 3");


       // Interview Question 4
        System.out.println("Interview Question 4");
        System.out.println(s2==s3); //== check for memory location
        System.out.println("in String Constant Pool(SCP) String reference to the same location, so true!");
        System.out.println(s6==s7);
        System.out.println("in Object Area(OA) String cannot reference to the same location, so False");

        // Interview Question 5
        System.out.println("Interview Question 5");
        System.out.println(s2.equals(s3)); //equals check for content is equal
        System.out.println(s6.equals(s7));
        System.out.println(s7.equalsIgnoreCase(s8)); // equals check for upper case lower case all!



    }
}
