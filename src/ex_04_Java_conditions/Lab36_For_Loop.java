package ex_04_Java_conditions;

public class Lab36_For_Loop {
    public static void main(String[] args) {

        //Using while loop
        int j=1;
        while (j<50)
        {
         if(j % 2==0)
         {
             continue;
         }
            System.out.println(j);
         j++;
        }

        /*Odd number out
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }*/
    }
}