import java.util.*;
public class AverageFun {
    public static double avg(int a ,int b,int c){
        double ag =(a+b+c)/3;
        return ag; 

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);{
            System.out.println("Enter three numbers");
            int x =sc.nextInt();
            int y =sc.nextInt();
            int z =sc.nextInt();
            System.out.println("Average= "+avg(x,y,z));
            sc.close();
        }
    }
    
}
