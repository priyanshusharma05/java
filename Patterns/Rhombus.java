public class Rhombus{
    public static void patt(int line){
        for(int i=1;i<=line;i++){
            for(int j=i;j<=line;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=line;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patt(7);
    }

}