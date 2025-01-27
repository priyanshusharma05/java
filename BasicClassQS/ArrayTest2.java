
import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        int list[] = new int[5];

        Scanner sc = new Scanner(System.in);{

        System.out.println("Enter 5 elements in array");

        // for(int x =0;x<list.length;x++){
        //     list[x] = sc.nextInt();

        // }
        for(int x=list.length - 1;x>=0;x--){
            list[x]=sc.nextInt();
        }
        for(int v:list){
            System.out.print(v + " ");
        }
        sc.close();
    }
            

        

        
    }
    
}
