
public class FactorialFun {
    public static int factorial(int n){
        int s=1;
        for(int i=1;i<=n;i++){
            s=s*i;
        }
        return s;
    }
    // binomial coefficient nCr = n!/r!(n-r)!
    public static int binomial(int m,int r){
        int coeff = factorial(m)/(factorial(r)*(factorial((m-r))));
        return coeff;
    }
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);{
        //     System.out.println("Enter the number");
        //     int num =sc.nextInt();
        //     sc.close();
        //     System.out.println("Factorial of "+num+" bb= "+ factorial(num));
        // }
        System.out.println("Coefficient= "+ binomial(5,2));
    }
}
