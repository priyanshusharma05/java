

public class BuyandSellStock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int min=arr[0];
        int profit=0;
        int maxprofit=0;
        for(int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            profit=arr[i]-min;
            maxprofit=Math.max(maxprofit,profit);
        }
        System.out.println(maxprofit);
    }
    
}
