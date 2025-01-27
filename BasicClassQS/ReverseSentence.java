// 2. WAP to enter a sentence and print all its word one by one in its reverse order.
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);{
        System.out.println("Enter the string:");
        String sen = sc.nextLine();
        
        String arr[]=sen.split(" ");
        for(String v:arr){
            StringBuilder sb = new StringBuilder(v);
            String reversed = sb.reverse().toString();
            System.out.print(reversed+" ");
            
        }
        
        sc.close();
    }
    }
}
