package ex_07_Java_Array;

public class Lab64_ArrayCop_Interview_Question {
    public static void main(String[] args) {
        int[] a={12,21,32,23,43};
        int[] copy= new int[a.length];
        System.arraycopy(a, 0, copy, 0, a.length);
        System.out.println(copy);
    }
}
