package CLGCOURSE;
import java.util.*;
public class Function1 {
    public static void printhelloworld(){
        System.out.println("Hello World!");
        //return; there's no neeed to write return when our function is giving void as output
    }
    public static int calculatesum(int num1,int num2){
        int sum = num1 + num2;
        return sum;

    }
    public static void main(String[] args) {
        printhelloworld();//function call
        System.out.println("Enter two numbers");
        Scanner sc =new Scanner(System.in);{
        int a =sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int sum =calculatesum(a,b);
        System.out.println("Sum is:"+sum);
        }

    }

     
    
}
