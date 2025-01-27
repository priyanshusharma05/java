package CLGCOURSE.Arrays;

public class RichestCustomerWealthLeetcode {
    public static void main(String[] args) {
        int[][] accounts={
            // {1,2,3},
            // {3,2,1},
            {1,5},
            {7,3},
            {3,5},
        };
        System.out.println(wealth(accounts));
    }
    static int wealth(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] arr1:arr){
            int sum=0;
            for(int digit:arr1){
                sum+=digit;
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }   
}
