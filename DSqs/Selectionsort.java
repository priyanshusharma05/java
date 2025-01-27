public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {23,-1,4,2,2,18};
        Selectsort(arr);
          
    }
    public static void Selectsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int tem=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=tem;
        }
        for(int v:arr){
            System.out.print(v+" ");
        }
    }
}
