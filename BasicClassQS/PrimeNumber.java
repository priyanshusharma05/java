import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);{
        System.out.println("Enter the number");
        int num =sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime Number");

        }
        else{
            System.out.println("Not prime number");
        }
        sc.close();
    }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        
    
    }
}