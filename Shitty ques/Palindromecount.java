import java.util.*;
public class Palindromecount {
    public static void main(String[] args) {
        ArrayList<String> stls=new ArrayList<>();
        Scanner sc=new Scanner(System.in);{
            int elements=sc.nextInt();
            for(int i=1;i<=elements;i++){
                System.out.println("enter strings");
                stls.add(sc.nextLine());
            }
            for(String v:stls){
                StringBuilder rev=new StringBuilder(v);
                if(v.equals(rev.reverse().toString())){
                    System.out.println("palindromic string: "+v);
                }
                }
            System.out.println("No palindrome find");

            sc.close();
        }

    }
    // static void palindromefinder(ArrayList<String> list){
    //     for(String v:list){
    //         StringBuilder rev=new StringBuilder(v);
    //         if(v.equals(rev.reverse().toString())){
    //             System.out.println("palindromic string: "+v);
    //         }
    //     }
    //     System.out.println("No palindrome find");
    // }
    
}
