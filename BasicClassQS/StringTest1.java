public class StringTest1 {
    public static void main(String[] args) {
        // String s =new String(); //default constructor
        String s1 =new String("mathura"); //parameterized
        String s2 = new String("mathura");
        if(s1==s2){
            System.out.println("s1 == s2");
        }
        
        if(s1.equals(s2)){
           System.out.println("s1 equals s2");
        }

        // String s3=s2.trim().concat(s1); //s2+s1
        // System.out.println("s3="+s3);
        
        // String s4=s3.replace('m','M').replace('g','G').replace('u','U');
        // System.out.println("S4="+s4);

        // String s5=s4.toUpperCase();
        // System.out.println("s5="+s5);

        // String arr[]=s5.split(" ");
        // for(String v: arr){
        //     System.out.println(v);
        // }
        




    }
    
}
