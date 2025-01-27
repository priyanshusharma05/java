import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the rate and time");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        double si= (x*y*z)/100;

        System.out.println("sinmple interest is =" + si);
  
       sc.close();
    }
}
