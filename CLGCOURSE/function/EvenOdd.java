import java.util.*;
public class EvenOdd {
    public static boolean iseven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);{
            System.out.println("Enter the number to check even");
            int n=sc.nextInt();
            System.out.println(iseven(n));
            sc.close();
        }
    }
    
}
