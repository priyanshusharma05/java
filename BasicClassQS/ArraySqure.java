import java.util.*;
public class ArraySqure {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        System.out.println("enter lenght of array");
       int n = sc.nextInt();
       System.out.println("enterarray");
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();  
       }
       int sum = 0;
       for(int i=0; i<arr.length;i++) {
    	   if(n%(i+1)==0) {
    		   sum=sum+ arr[i]*arr[i];   
    	   }     
       }
       System.out.println(sum);
       sc.close();
    }
	}
}
