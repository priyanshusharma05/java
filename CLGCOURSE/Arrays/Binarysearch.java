
import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={-1,0,3,4,23,56};
        int target=23;
        System.out.println(gettarget(arr,target));
    }
    static int gettarget(int[] arry,int target){
        Arrays.sort(arry);
        int st=0;
        int end=arry.length;
        while(st<=end){
            int mid=(st+end)/2;
            if(target<arry[mid]){
                end=mid-1;
            }else if(target>arry[mid]){
                st=mid+1;
            }else{
                return mid;
            }
        }return -1;
    }
}
