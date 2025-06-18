package ex_03_Java_Operators;

public class Lab_06_Ternary_operators {
    public static void main(String[] args) {
        boolean condition = true;
        String result = (condition) ? "True" : "False";
        System.out.println(result);

        // Nested ternary operator
        int age = 77;
        String result1= (age<18) ? "Minor" : (age>65) ? "Senior citizen" :"Adult";
        System.out.println(result1);

        //Interview Example
        int n1=2, n2=5, n3=-9;
        int max = (n1>n2) ? (n1>n3)? n1 :n3 : (n2>n3) ? n2:n3 ;
        System.out.println(max);
        //A - n1>n3
    }
}
