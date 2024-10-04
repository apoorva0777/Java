package String;

import java.util.Scanner;

public class count_vowels {
    public static void main(String[] args) {
        String vowels="aeiouAEIOU";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
