package ex_06_Java_String;

public class Lab55_String_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder, Buffer -> they are mutable. it means whenever you change, for example string buffer name is equal to suresh, if you want to change it to ramesh nothing will be happen only one string will be there.
        StringBuilder SB=new StringBuilder("hello");
        SB=SB.append(" world");
        System.out.println(SB);
        SB.insert(11,"new");
        System.out.println(SB);
        SB.replace(11, 14,  "Java");
        System.out.println(SB);
        SB.reverse();
        System.out.println(SB);
    }

}
