
import java.util.Arrays;

public class Anagram{
    public static void main(String[] args) {
        String st1="listen";
        String st2="silen";
        System.out.println(anagrmachecker(st1,st2));
    }
    static boolean anagrmachecker(String s1,String s2){
        String s3=s1.toLowerCase();
        String s4=s2.toLowerCase();
        if(s3.length()!=s4.length()){
            return false;
        }
        char[] arr1=s3.toCharArray();
        char[] arr2=s4.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            return true;
        }else
        return false;
}
}

