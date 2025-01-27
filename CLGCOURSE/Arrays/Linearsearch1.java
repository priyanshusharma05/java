package CLGCOURSE.Arrays;

public class Linearsearch1 {
    static int IndexFinder(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int ElemenntFinder(int arr[],int targetindex){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        else if(targetindex>arr.length){
            return Integer.MAX_VALUE;
        }
        for(int i=0;i<arr.length;i++){
            int element =arr[targetindex];
            if(arr[i]==element){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {

    int nums[]={12,23,54,6,7,89,0,-2,-77,-89,88,65,44,33};
    int ans=IndexFinder(nums,89);
    int ans2=ElemenntFinder(nums,20);
    System.out.println("Index: "+ans);
    System.out.println("Value: "+ans2);
        
    }   
}
