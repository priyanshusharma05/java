import java.util.Scanner;

class Operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter two numbers");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x + y;
        System.out.println("Sum of two numbers = " + z);
        sc.close();
    }
}
