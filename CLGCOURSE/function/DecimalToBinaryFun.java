public class DecimalToBinaryFun {
    public static void dectobin(int num){
        StringBuilder binary= new StringBuilder();
        while(num>0){
            int rem=num%2;
            num=num/2;
            binary.append(rem);
            if(num==1){
                System.out.print(1);
                break;
            }
        }
        System.out.print(binary.reverse());
    }
    public static void main(String[] args) {
        dectobin(7);
    }
}
