package String;

public class compareto {
    public static void main(String[] args) {
        String a="toy";
        String b="toy";

        //a>b : +ve value
        //a==b : 0
        //a<b : -ve value

        if(a.compareTo(b)==0){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
    }
}
