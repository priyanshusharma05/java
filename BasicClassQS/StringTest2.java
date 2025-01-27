// write a program to enter string and check if hte string is palindrrome or not .
// wap to enter a strimg and check if its last second char is happy or not.
// wap to enter a sentence and print all its words one by one by chamging their first and last letter capital.
import java.util.Scanner;
public class StringTest2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);{
        System.out.println("Enter the string");
        String x = sc.nextLine();

        StringBuilder sb = new StringBuilder(x);
        String reversed = sb.reverse().toString();
        
        // System.out.println("Original String: " + x);
        // System.out.println("Reversed String: " + reversed);
        if(x.equals(reversed)){
            System.out.println("It is a palindrome");

        }
        else {
            System.err.println("It is not palindrome");
        }
        sc.close();
    }
    }
}