package CLGCOURSE.Arrays;

public class Minnumber {
    public static void main(String[] args) {
        int nums[]={12,23,54,6,88,65,44,33};
        System.out.println(min(nums));
        System.out.println(max(nums));
    }       
    static int max(int arr[]){
        int var=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>var){
                var=arr[i];
            }    
        }
        return var;
    }
    static int min(int arr[]){
        int var=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<var){
                var=arr[i];
            }    
        }
        return var;
    }
}
