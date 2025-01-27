import java.util.Scanner;

class AreaCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the radius of circle");

        int r = sc.nextInt();

        double ar= (3.14*(r*r));
        System.out.println("Volume ="+ ar);
        sc.close();
      
}
}