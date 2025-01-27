public class Reverseelemnt {
    public static void main(String[] args) {
        int[] arr={12,20,43,45,67,876,54};
        reverse(arr);
    }
    public static void reverse(int[] arr){
        int [] arr2=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            String st="";
            while(arr[i]>0){
                String st1=Integer.toString(arr[i]%10);
                st=st+st1;
                arr[i]=arr[i]/10;
                arr2[i]=Integer.parseInt(st);
        }
    }
        for(int x:arr2){
            System.out.print(x+" ");
        }
    }
}
