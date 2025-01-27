
public class Largestinarray {
    public static void main(String[] args){
        int [] arr={
            1,23,6,3,5
        };
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);


    }
    
}
