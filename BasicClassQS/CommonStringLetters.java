// 1. WAP to enter two String and print only common letters.

// 3. WAP to enter two Strings and print only common small letters.
// 4. WAP to enter a string and convert all upper letter to small and small to upper
import java.util.Scanner;
public class CommonStringLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        System.out.println("enter two strings");
        String x = sc.nextLine();
        String y = sc.nextLine();
        String arr1[]=x.split("");
        String arr2[]= y.split("");
        for(String a:arr1){
            for(String b:arr2){
                if(a.equals(b)){
                    System.out.println(a);   
                }
            
            }
            
        

        }
        sc.close();
    } 

    }
    
}
