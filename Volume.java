import java.util.Scanner;

class Volume {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the radius and height of cylinder");

        int x = sc.nextInt();
        int y= sc.nextInt();

        double vol= (3.14*(x*x)*y);
        System.out.println("Volume ="+ vol);
        sc.close();
}
}