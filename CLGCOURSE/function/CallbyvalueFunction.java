import java.util.Scanner;

public class CallbyvalueFunction {
    public static void swap(int num1 , int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("a="+num1);
        System.out.println("b="+num2);

    }
        public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc =new Scanner(System.in);{
        int a =sc.nextInt();
        int b=sc.nextInt();
        swap(a, b);
        sc.close();
        }

    }
    
}
