import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();

        if(x>y){
            System.out.println(x);
            System.out.println("Thanks");
        }
        else{
            System.out.println(y);
        }
        sc.close();

    }
}
