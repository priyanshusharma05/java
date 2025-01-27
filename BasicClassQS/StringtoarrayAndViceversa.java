public class StringtoarrayAndViceversa {
    public static void main(String[] args) {
        String str ="i love DOREAMONE";
        // char[] strarr=str.toCharArray();
        // for(char ch:strarr){
        //     System.out.print(ch+",");
        // }
        // System.out.println();
        // String arrst=Arrays.toString(strarr);
        // System.out.println(arrst);
        String[] arr=str.split(",");
            for(String st:arr){
            System.out.println(st+" ");
        }

    }
}
