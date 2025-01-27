// wap to enter a string  and change all the vowels with previous letter.
// wap to create an array of five strings and count the array elements count the array elements which have all the vowels.

public class Strarr{
    public static void main(String[] args){
        String[] arr={"education","thank","you","cauliflower"};
        for(String st:arr){
            if(isconsistallvowel(st)==true){
                System.out.println(st);
            }
        }

    }
    public static boolean isconsistallvowel(String st){
        char[] arr={'a','e','i','o','u'};
        int count=0;
        for(char ch:arr){
            
            for(int i=0;i<st.length();i++){
                if(ch==st.charAt(i)){
                    count++;
                }
            }
        }
        if(count>=5){
            return true;
        }else{
            return false;
        }
    }
}