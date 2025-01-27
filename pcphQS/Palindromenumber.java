public class Palindromenumber{
    public static int palsum(int[] arr){
        int sum =0;
        for(int i :arr){
            String st = Integer.toString(i);
            StringBuilder sb=new StringBuilder(st);
            if(st.equals(sb.reverse().toString())){
                sum+=i;

            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array1={12,121,233,453,454,675,101,234,343};
        System.out.println("Sum of palindrome number = " + palsum(array1));
    }
}