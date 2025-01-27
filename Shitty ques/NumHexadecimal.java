import java.util.*;
public class NumHexadecimal {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        Scanner sc =new Scanner(System.in);{
            System.out.println("Enter number of elements");
            int elements=sc.nextInt();
            System.out.println("Enter the "+elements+" numbers");
            for(int i=0;i<elements;i++){
                numbers.add(sc.nextInt());
            }
            for(int x:numbers){
                String hexnum =(Integer.toHexString(x)).toUpperCase();
                System.out.println("Decimal Number: "+x+" HexaDecimal: "+hexnum);
            }
        }

    }
    
}
