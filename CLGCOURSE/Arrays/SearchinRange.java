package CLGCOURSE.Arrays;

public class SearchinRange {
    static int InRangeFinder(int arr[],int targetindex,int start,int end){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        else if(targetindex>arr.length){
            return Integer.MAX_VALUE;
        }
        for(int index=start;index<end;index++){
            int element =arr[targetindex];
            if(arr[index]==element){
                return arr[index];
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int nums[]={12,23,54,6,7,89,0,-2,-77,-89,88,65,44,33};
        int starting=2;
        int ending=8;
        int target=3;
        System.out.println(InRangeFinder(nums, target,starting, ending));
    }
    
}
