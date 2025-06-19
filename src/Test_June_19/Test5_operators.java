package Test_June_19;

public class Test5_operators {
    public static void main(String[] args) {
        int a= 10, b=10;
        //Assignment Operators
        a += b;
        System.out.println(a);
        //Arithmetic Operators
        int c=a+b;
        System.out.println(c);
        //Unary Operators
        int u=-10;
        System.out.println(u);
        //Boolean operator
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1 && b2: " + (b1 && b2));
        //Relationship operator
        String test1 = "mytest1", test2 = "mytest2";
        System.out.println("test1 == test2:" + (test1==test2));
        //Ternary Operator
        boolean condition = true;
        String result = (condition) ? "True" : "False";
        System.out.println(result);

    }
}
