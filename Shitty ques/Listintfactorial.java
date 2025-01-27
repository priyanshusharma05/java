import java.util.*;
public class Listintfactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            ArrayList<Integer> nums=new ArrayList<>();
            System.out.println("enter number of elements");
            int elements=sc.nextInt();
            System.out.println("enter "+elements+" numbers");
            for(int i=0;i<elements;i++){
                nums.add(sc.nextInt());
            }

            for(int x:nums){
                long fac=1;
                for(int j=1;j<=x;j++){
                    fac=fac*j;
                }
                System.out.println("Number:"+x+"  Factorial:"+fac);


            }
            sc.close();
        }   
    }
}