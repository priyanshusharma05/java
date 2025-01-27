// 1- WAP to create an integer array of size 10,print the elements and count the no. of even or elements.
import java.util.Scanner;
class ArrayEvenOrOddCounter{
    public static void main(String[] args) {
        int list[] = new int[10];
        int counter=0;
        Scanner sc= new Scanner(System.in);{

        System.out.println("Enter 10 numbers in the array");
        
        for(int x=0;x<list.length;x++){
            list[x]=sc.nextInt();
        
        }
        System.out.println("Array elements:" );
        for(int v:list){
            System.out.print(v + " ");
        }
        for(int i:list){
            if(i%2==0){
                counter+=1;
            }
        
        }
        System.out.println("\nTotal Even numbers in the given array is:"+ counter);
        sc.close();
    }

        


    }
}