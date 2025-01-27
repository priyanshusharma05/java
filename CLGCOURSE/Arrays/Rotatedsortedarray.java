
public class Rotatedsortedarray {

    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int target = 0;
        System.out.println(getindex(arr, target));
    }

    static int getindex(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[st] <= arr[mid]) { //leftsorted
                if (arr[st] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else { //rightsorted
                if (arr[st] <= target && target <= arr[end]) {
                    st=mid+1;
                } else {
                    end = mid - 1;
                }
            }
        }return -1;
    }

}
