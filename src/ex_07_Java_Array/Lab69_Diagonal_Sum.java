package ex_07_Java_Array;

public class Lab69_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] a={{1,2,3}, {4,5,6}, {7,8,9}};
         int n=a.length;
         int primaryDiagonalSum = 0;
         int secondaryDiagonalSum = 0;

         for(int i=0; i<n; i++)
         {
             primaryDiagonalSum+=a[i][i];
             secondaryDiagonalSum+=a[i][n-1-i];
         }
        System.out.println("Matrix");
         for(int[] row:a){
             for(int value : row){
                 System.out.print(value+" ");
             }
             System.out.println();
         }
        System.out.println("Sum of the Primary Diagonals "+ primaryDiagonalSum);
        System.out.println("Sum of the seconday Diagonals "+secondaryDiagonalSum);

    }
}
