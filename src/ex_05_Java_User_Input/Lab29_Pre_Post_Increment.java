package ex_05_Java_User_Input;

public class Lab29_Pre_Post_Increment {
    public static void main(String[] args) {
        int Incr=10;
        System.out.println("Before Increment: "+Incr);
     int preIncr=++Incr;
        System.out.println("Pre Increment: "+Incr);

     int Incr1=10;
        System.out.println("Before Increment: " +Incr1);

     int postIncr=Incr1++;
     System.out.println("Post Increment:" +Incr1);
     //-------------------------------------------------------
     int b=10;

        System.out.println(b++ + ++b);//10 + 12 = 22
        System.out.println(++b + b++); // 13+13 =24
        System.out.println(b); //14




    }
}
