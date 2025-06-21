package ex_05_Java_User_Input;

public class Lab30_Task_June_13 {
    public static void main(String[] args) {
        int a=5;
        int b=a++;// 5
        //b=5,a=6
        System.out.println("a: "+ a +",b:" +b);
        System.out.println(b);

        //--------------------------------------------

        int i=1;
        i=i++ + ++i; // 1 + 3
        System.out.println(i);

        //----------------------------------------------
        int x=5;
        System.out.println(x++ + ++x); //5 + 7 = 12


        //------------------------------------------------
        int y=5;
        System.out.println(++y); // 6
        System.out.println(y++); //6
        System.out.println(y); //7

        //---------------------------------------------
        int z=5;
        int z1=z++ + ++z;
        System.out.println("z:" + z); //7
        System.out.println("z1:" + z1); //12

        //--------------------------------------------
        int p=5;
        int p1=p++ + ++p + p++ + ++p; // 5 + 7 + 7 + 9
        System.out.println("p = "+p+",p1 = "+p1); // p=9, p1=28

    }
}
