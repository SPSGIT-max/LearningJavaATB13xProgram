package ex_07_Java_Array;

public class Lab59_Array_Sum {
    public static void main(String[] args) {
        int[] array={1,2,22,33,44};
        int sum=0;
        for(int i=array.length-1; i>=0;i--)
        {
            sum=sum+array[i];
            System.out.println(sum);
        }
    }
}
