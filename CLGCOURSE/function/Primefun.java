import java.util.Scanner;
public class Primefun {
    public static boolean isprime(int num){
        int count =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count+=1;
            }
        }
        if(count==2){
            return true;
        }
        else 
            return false;
    }
    public static void primerange(int end){
        int count=0;
        for(int i=2;i<=end;i++){
            if(isprime(i)){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Total prime numbers= "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter the number");
            int n=sc.nextInt();
            // System.out.println(isprime(n));
            primerange(n);
            sc.close();
        }
    }
}
