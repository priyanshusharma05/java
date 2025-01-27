import java.util.*;
public class Wordreverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);{
        System.out.println("Enter string");
        String wd=sc.nextLine();
        StringBuilder sb=new StringBuilder(wd);
        String revst =sb.reverse().toString();
        System.out.print(revst);

        sc.close();

        }
        

    }
    
}
