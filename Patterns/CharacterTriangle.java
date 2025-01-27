import java.util.*;
public class CharacterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter Number Of Lines");
            int n = sc.nextInt();
            char ch= 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++; 
            }
            System.out.println();
        }
        sc.close();
    }
    }   
}
