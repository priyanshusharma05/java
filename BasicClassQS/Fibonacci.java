import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        System.out.println("Enter the number of terms");
        int x=sc.nextInt();
        int a=0,b=1,c;
        System.out.println("Fibonacci Series till "+x+"terms:");
        for(int i=0;i<x;i++){
            System.out.print(a+" ");
            c=b+a;
            a=b;
            b=c;
        }
        sc.close();
    }

    }
    
}
