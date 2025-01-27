public class SumOfDigits {
    public static int sum(int num){
        int sum =0;
        while(num>0){
            int last_dig=num%10;
            sum+=last_dig;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum is= "+sum(6969));
    }
    
}
