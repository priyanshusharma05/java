import java.util.Scanner;
public class SentenceException {
    public static String[] samewords(String sentence) throws Exception {
        String[] words = sentence.split("\\s+");
        String[] matchingWords = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (word.length() > 1 && Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(word.charAt(word.length() - 1))) {
                matchingWords[count] = word;
                count++;
            }
        }
        if (count == 0) {
            throw new Exception("No word found with the same first and last letters!!!");
        }
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = matchingWords[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        try {
            String[] words = samewords(sentence);
            System.out.println("same words:");
            for (String word : words) {
                System.out.println(word);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}