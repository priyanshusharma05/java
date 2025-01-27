public class Stringreplaceinarray {
    public static void replacer(String[] arr){
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            for(int j=0;j<sb.length()-1;j++){
                if(isvowel(sb.charAt(j))){
                    char nextChar = (char) (sb.charAt(j) + 1);
                    sb.setCharAt(j, nextChar);
                }
            }
            arr[i]=sb.toString();
        }
    }
    public static boolean isvowel(char c){
        char ch=Character.toLowerCase(c);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        String arr[]={"love","you"};
        replacer(arr);
        for(String i:arr){
            System.out.print(i+" ");
        }
    }
}

