public class Mostwatercontained {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int maxar=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                maxar=Math.min(height[i], height[j]) * (j - i);
            }
        }
        System.out.println(maxar);

    }
    
}
//ewrong
