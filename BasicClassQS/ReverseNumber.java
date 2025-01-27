public class ReverseNumber {
    public static void main(String[] args) {
        int num =12345;
        String numst=Integer.toString(num);
        System.out.println("Reverse Number");
        for(int i=numst.length()-1;i>=0;i--){
            char ch=numst.charAt(i);
            System.out.print(ch);
        }
    }
    
}
