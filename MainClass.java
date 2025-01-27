
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);{
        System.out.println("Enter length and breadth");
        int x= sc.nextInt();
        int y = sc.nextInt();

        RectangleArea rl = new RectangleArea(x,y);

        rl.area();
        sc.close();
        }
    }
    
}
