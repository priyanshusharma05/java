
import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int target = 0;
        System.out.println(gettriplet(arr, target));

    }

    public static List gettriplet(int[] arr, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(arr);
        if(arr.length<3){
            return new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];

                if(sum==0){
                    List<Integer> ll=new ArrayList<>();
                    ll.add(arr[i]);
                    ll.add(arr[j]);
                    ll.add(arr[k]);
                    result.add(ll);
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }return new ArrayList<>(result);


    }

}
