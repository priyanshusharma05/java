public class HollowRhombus {
    public static void printpattern(int rows){
        for(int i=1;i<=rows;i++){
            for(int j =i;j<=rows;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=rows;k++){
                if(i==1 || i==rows || k==1 || k==rows){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        printpattern(5);
    }
    
}
