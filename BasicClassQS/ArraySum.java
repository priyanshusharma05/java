
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int list[] = new int[5];
        int sum=0;

        Scanner sc = new Scanner(System.in);{

        System.out.println("Enter 5 elements in array");

        for(int x =0;x<list.length;x++){
            list[x] = sc.nextInt();

        }
        for(int v:list){
            System.out.print(v + " ");
            sum=sum+v;
        }
        System.out.println("\nSum of array elememnts="+sum);

        sc.close();
    }

    }
    }
