import java.util.*;

public class Pangram {
    public static void main(String[] args) {
    String str="the very quick brown fox jumps over a lazy dog";
    System.out.println(ispangram(str));
    
}
static boolean ispangram(String st){
    String st1=st.replace(" ", "");
    Set<Character> letters=new HashSet<>();
    for (int idx = 0; idx < st1.length(); idx++) {
        letters.add(st1.charAt(idx)); 
    }
    if(letters.size()==26){
        return true;
    }else
    return false;
}
}
