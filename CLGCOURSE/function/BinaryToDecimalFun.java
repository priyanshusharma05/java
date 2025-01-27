import java.util.*;
public class BinaryToDecimalFun {
    public static int bintodec(int num){
        int decnum=0;
        int pow=0;
        while(num>0){
            int last_digit=num%10;
              decnum+=(int)last_digit*(Math.pow(2,pow));
              pow+=1;
              num=num/10;
        }
        return decnum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter the binary number");
            int n=sc.nextInt();
            System.out.println("Decimal Number= "+bintodec(n));
            sc.close();
        }
    }
    
}
