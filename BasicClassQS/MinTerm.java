import java.util.Scanner;
class MinTerm
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter three numbers");
        int x =sc.nextInt();
        int y =sc.nextInt();
        int z =sc.nextInt();
        if(( x<y) && (y<z)){
            System.err.println(y+" "+"is mid term");
        }
        else if(( y<x) && (x<z)){
            System.err.println(x+" "+"is mid term");
        }
        else{
            System.err.println(z+" "+"is mid term");
        }
        sc.close();

        
    }
}