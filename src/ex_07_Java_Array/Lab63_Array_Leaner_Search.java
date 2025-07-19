package ex_07_Java_Array;

public class Lab63_Array_Leaner_Search {
    public static void main(String[] args) {

        int[] num = {10, 12, 1, 3, 56};
        int target = 3;
        for (int i=0; i<num.length;i++) {
            if (target == num[i]) {
                System.out.println(i);
            }
        }
    }
}
