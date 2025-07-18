package ex_07_Java_Array;

import java.util.Arrays;

public class Lab60_Array_SecondHighest_Num {
    public static void main(String[] args) {
        int[] number={12,11,23,34,4,5,71,99};
        Arrays.sort(number);
        System.out.println(number[number.length-2]);

    }
}
