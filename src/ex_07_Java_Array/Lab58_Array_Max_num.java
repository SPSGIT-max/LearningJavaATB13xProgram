package ex_07_Java_Array;

public class Lab58_Array_Max_num {
    public static void main(String[] args) {
        int[] array={12,10,13,9,8,90,100,1};
        int max_output=Maxnumber(array);
        System.out.println("Min Number is "+max_output);

    }
    static int Maxnumber(int[] array)
    {
        int max=array[0];
        for(int i=0; i<array.length; i++)
        {
            if (array[i]<max)
            {
                max=array[i];
            }
        }
        return max;
    }
}
