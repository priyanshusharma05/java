package CLGCOURSE.Arrays;

public class Searchinstring {
    static boolean searchst(String str,char target){
        for (int i = 0; i <str.length(); i++) {
            if(str.length()==0){
                return false;
            }
            if(str.charAt(i)==target){
                return true;
            }
            
        }
        return false;

    }
    public static void main(String[] args) {
        String st1="priyanshu";
        char tar='x';
        System.out.println(searchst(st1, tar));
    }
    
}

