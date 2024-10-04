package String;

import java.util.Scanner;

public class uncommon_letter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        char[] ar1=a.toCharArray();
        char[] ar2=b.toCharArray();

        for(int i=0;i<ar1.length;i++){
            if(ar2[i]!=ar1[i]){
                System.out.println(ar2[i]);
            }
        }
    }
}
