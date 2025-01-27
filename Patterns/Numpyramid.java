public class Numpyramid{
    public static void main(String[] args) {
        int n=5;
        for(int i=0,p=1;i<n;i++,p++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            
            for(int j=0;j<=i;j++){
                System.out.print(p+" ");
            }
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
