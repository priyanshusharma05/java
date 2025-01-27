package CLGCOURSE.Arrays;
public class Basicaar1 {
    public static void update1(int arr[],int nonchangable){
        nonchangable =10;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }

    }

    public static void main(String args[]){
        int nonchangable = 5;
        int marks[] = {69,79,89,99};
        System.out.println("Before calling Function:");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        update1(marks,nonchangable);
        System.out.println("After Calling Function:");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        //arrays values have changed in main function coz it called by reference
        // now because variable na,ed nochangable passed by call by value so it's value would'nt change
        System.out.println();
        System.out.println(nonchangable);

    }

}
