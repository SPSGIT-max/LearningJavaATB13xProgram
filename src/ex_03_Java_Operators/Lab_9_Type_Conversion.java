package ex_03_Java_Operators;

public class Lab_9_Type_Conversion {
    public static void main(String[] args) {
        //Widening Implicit conversion
        //Byte->Short ->int -> long -> float -> double
        byte b = 10;
        int a = b; //Widening Implicit casting
        int a1 = (int)b; // Widening explicit casting // JVM says its not mandatory




        //Narrow Explicit conversion
        //Byte <- Short <- int <- long <- float <- double
        int c=1010110;

        //short d1 = c; //Narrowing  - Implicit casting is not allowed
        short d = (short) c; //Narrowing  - explicit casting is allowed

        long phoneNumber = 9620933441l;
        int i = (int)phoneNumber;
        System.out.println(i);

    }
}
