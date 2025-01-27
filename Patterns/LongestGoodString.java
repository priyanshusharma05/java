import java.util.Scanner;

public class LongestGoodString {

    public static void main(String[] args) {
        // Input string from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String S = scanner.nextLine();
        
        int maxLength = 0;
        int currentLength = 0;
        int start = -1;
        int maxStart = -1;
        
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            
            // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                
                if (currentLength == 0) {
                    start = i;  // Start of the current vowel substring
                }
                currentLength++;
            } else {
                // If it's not a vowel, check if we need to update the max length
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStart = start;
                }
                currentLength = 0;  // Reset the current length
            }
        }

        // Check one last time in case the longest substring ends at the end of the string
        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxStart = start;
        }

        // If no vowels were found, print an empty string
        if (maxStart == -1) {
            System.out.println("The longest good string is: ");
        } else {
            // Print the longest good string
            System.out.println("The longest good string is: " + S.substring(maxStart, maxStart + maxLength));
        }
    }
}
// public class GoodString {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s=sc.nextLine();

//         int start=0;
//         int end=0;
//         int currentLength=0;
//         for(int i=0;i<s.length();i++){
//             char c =s.charAt(i);
//             if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||
//             c=='A' || c=='E'|| c=='I'|| c=='O'|| c=='U'
//             ){
//                 if(currentLength==0){
//                     start=i;
//                 }

//             }
//             else{

//             }
//         }

//     }
// }