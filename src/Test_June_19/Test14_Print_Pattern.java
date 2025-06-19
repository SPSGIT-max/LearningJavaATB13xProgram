package Test_June_19;

public class Test14_Print_Pattern {
    public static void main(String[] args) {
        int range=5;

        for(int i=1;i<=range;i++)
        {
            for (int j = 1; j <= range - 1; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i-1); k++)
            {
                System.out.print("*" );
            }
            System.out.println();
        }
    }
}
