package ex_03_Java_Operators;

public class Lab_03_Unary_operators {
    public static void main(String[] args) {
        int a= 10, b=1;

        a=-10;
        System.out.println(a);

        boolean cond = true;
        System.out.println("Cond is: " + cond);
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);

        System.out.println("Now cond is: " + !cond);
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));

        b++; // 1 incremented to 2
        System.out.println(b);

        ++b;
        System.out.println(b);

        b--;
        System.out.println(b);

        --b;
        System.out.println(b);

        System.out.println(b + "'s bitwise complement = " + ~b);

    }
}
