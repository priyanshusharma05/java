// // wap to enter a sentence and print all its words one by one by changing their first and last letter capital.
import java.util.Scanner;

public class Sentence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        // Split the sentence into words
        String[] words = input.split(" ");

        for (String word : words) {
            String result;
            if (word.length() > 1) {
                result = word.substring(0, 1).toUpperCase() +
                         word.substring(1, word.length() - 1) +
                         word.substring(word.length() - 1).toUpperCase();
            } else {
                result = word.toUpperCase();  
            }
         
            System.out.println(result);
        }

        sc.close();
    }
}
