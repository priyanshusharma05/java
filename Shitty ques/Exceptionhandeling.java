import java.util.*;

// public class ExTest {
//     public void test(int a, int b) {
//         try {
//             int z = a / b;
//             System.out.println(z);
//         } catch (Exception e) {
//             System.out.println("Second number should not be zero");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);{
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         ExTest t1 = new ExTest();

//         t1.test(num1,num2);
//     }
// }}
class Extest {
    public void test(int age) {
        try {
            if (age > 100)
                throw new InvalidAgeException();
            else
                System.out.println(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter your Age");
            int age = sc.nextInt();
            Extest t1 = new Extest();

            t1.test(age);
        }
    }
    class InvalidAgeException extends Exception{
        public InvalidAgeException(){
            super("Invalid Age");
            
        }
    }
}