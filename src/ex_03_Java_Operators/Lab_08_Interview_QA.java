package ex_03_Java_Operators;

public class Lab_08_Interview_QA {
    public static void main(String[] args) {
        int a=10, b=20 ;
        String s =" My ", s2="name";
        System.out.println("String concatenation "+ s + s2); // My name
        System.out.println("addition "+ (a+b)); // addition 30
        System.out.println(s+s2+(a+b)); //My name30  this works under BODMAS principal (Brackets, order(power, indices, or roots), Division, Multiplication, Addition, Subtraction
        System.out.println(s+s2+a+b); // My name1020
        System.out.println(a+b+s+s2); // 30 My name


        System.out.println(10==10); //true
        System.out.println(10<10); //false
        System.out.println(10>10); //false
        System.out.println(10>=10); //true
        System.out.println(!(10>10)); //true

        //Compound Operators
        int age=10;
        age/=10;
        System.out.println(age);
        age+=10;
        System.out.println(age);
        age-=10;
        System.out.println(age);

        int c=1;
        boolean d=(10==11);
        System.out.println(c);
        System.out.println(d);


        char a1='A'; // ASCII Value A- 65
        char b1='B';  // ASCII Value A- 66
        System.out.println(a1+b1);

        short s1=10;
        char c1= 'A';
        String s3="A";
        System.out.println(c1); // A
        System.out.println(c1+c1); // 130
        System.out.println(s1+c1); // 10 + 65
        System.out.println(s3+c1); // AA



    }
}
