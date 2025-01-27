
import java.util.Scanner;

public class CelsiusToFarenehiteConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("enter temp in celsius");
           int x= sc.nextInt();
           double z=x*(9.0/5.0)+32;
           System.out.println("Tem in F:"+z);
        
        sc.close();
        }

    }
    
}
