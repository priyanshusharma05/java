public class Movezero{
    public static void main(String[] args) {
        int [] arr={0,1,0,3,12};
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
 }
}