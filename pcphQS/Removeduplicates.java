public class Removeduplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] arr){
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }return i+1;

    }
}
