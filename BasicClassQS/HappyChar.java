// wap to enter a strimg and check if its last second char is happy or not.
// wap to enter a sentence and print all its words one by one by chamging their first and last letter capital.
import java.util.Scanner;
public class HappyChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);{
        System.out.println("Enter the string");
        String x = sc.nextLine();

        if(x.charAt((x.length())-1) == x.charAt((x.length())-3) ){

        System.out.println(x.charAt(x.length() - 2)+"\n:second last character is a happy character");
        }
        else{
            System.out.println("not a happy character");
        }
        sc.close();
    }
    }
} 