package Test_June_19;

public class Test3_Inc_Pre_Post {
    public static void main(String[] args) {
        int i=10;
        System.out.println("Initial value of i: "+ i);
        System.out.println(++i);
        System.out.println("After pre increment value of i: "+ i);

        System.out.println("Initial value of i: "+ i);
        System.out.println(i++);
        System.out.println("After Post Increment value of i: "+ i);
    }
}
