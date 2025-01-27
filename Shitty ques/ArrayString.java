
import java.util.*;

public class ArrayString {
    public static void main(String[] args) {
        ArrayList<String> strs=new ArrayList<>();
        Scanner sc =new Scanner(System.in);{
        System.out.println("Enter the number of elements");
        int elements=sc.nextInt();
        for(int i=0;i<elements;i++){
            strs.add(sc.nextLine());
        }
        for(String x:strs){
            if(x.length()>2){
                String modified=x.substring(0,1).toUpperCase() + 
                x.substring(1,x.length() -1) +
                x.substring(x.length() -1,x.length()).toUpperCase();
                
                System.out.println("Modified String "+modified);

            }
            

        }
        sc.close();

        }


    }
}
