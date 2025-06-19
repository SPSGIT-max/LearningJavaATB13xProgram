package Test_June_19;

public class Test6_Largest_of_3 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 90, n3 = -10;

        if ((n1 > n2) && (n1 > n3)) {
            System.out.println("Largest Number is: " + n1);
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("Largest Number is: " + n2);
        } else {
            System.out.println("Largest Number is: " + n3);
        }
    }
}
