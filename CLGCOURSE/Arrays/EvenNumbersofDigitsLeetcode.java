package CLGCOURSE.Arrays;

public class EvenNumbersofDigitsLeetcode {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println("Number of even numbers of digits:"+evencount(nums));
    }
    static int evencount(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
                String st=Integer.toString(arr[i]);
                if(st.length()%2==0){
                    count++;
                } 
        }
        return count;
    }
}
