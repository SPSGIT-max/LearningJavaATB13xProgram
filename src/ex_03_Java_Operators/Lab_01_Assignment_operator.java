package ex_03_Java_Operators;

public class Lab_01_Assignment_operator {
    public static void main(String[] args) {
        /* int -> data type
         a -> Identifier
         = -> Assignment operator (RHS to the LHS
         10 - > Literals
         */
        int a= 10, b=10;
        a += b;
        System.out.println(a);

        a -= b;
        System.out.println(a);

        a *= b;
        System.out.println(a);

        a /= b;
        System.out.println(a);

        a %= b;
        System.out.println(a);
    }
}
