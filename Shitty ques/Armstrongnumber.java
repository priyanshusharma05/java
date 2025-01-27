public class Armstrongnumber {
    public static void main(String[] args) {
    int num =153;
    String st=Integer.toString(num);
    int sum=0;

    for(int i=0;i<st.length();i++){
        int n=st.charAt(i) - '0';
        sum+= (int)Math.pow(n,st.length());
    }
    if(sum==num){
        System.out.println(num+" is a armstrong number");
    }else{
        System.out.println("Not a armstrong number");
    }
}
    
}
