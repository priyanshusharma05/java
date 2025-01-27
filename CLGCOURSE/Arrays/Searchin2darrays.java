package CLGCOURSE.Arrays;

import java.util.Arrays;

public class Searchin2darrays {
    public static void main(String[] args) {       
        int[][] arr={
            {12,34,56},
            {23,44,5,6},
            {12,45,77,88,99},
            {23,44}
        };//this is called jagged array having different row length
        int target=99;
        int[] ans=search2d(arr, target);
        System.out.println("Target Index:");
    System.out.println(Arrays.toString(ans));
    System.out.println("Max value:");
    System.out.println(max2d(arr));
    }
    static int[] search2d(int[][] arr1,int target){
        for(int row=0;row<arr1.length;row++){
            for (int col = 0; col <arr1[row].length; col++) {
                if(arr1[row][col]==target){
                    return new int[]{row,col};
                }
                
            }

        }
        return new int[]{-1,-1};

    }
    static int max2d(int[][] arr1){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr1.length;row++){
            for (int col = 0; col <arr1[row].length; col++) {
                if(arr1[row][col]>max){
                    max=arr1[row][col];
                }               
            }
        }
        return max;

    }
}
