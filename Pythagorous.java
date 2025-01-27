import java.util.Scanner;
public class Pythagorous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Emter  base and perpendiculer(cm)");
            Double x =sc.nextDouble();
            Double y =sc.nextDouble();
            double z= Math.sqrt(Math.pow(x,2 )+ Math.pow(y,2));
            
            System.out.println("Hypotenuse:"+z);

            sc.close();
        }

    }
    
}
