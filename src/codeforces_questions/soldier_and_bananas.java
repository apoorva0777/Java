package codeforces_questions;

import java.util.Scanner;

public class soldier_and_bananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int sum=0;
        for(int i=0;i<=w;i++){
            int t=k*i;
            sum=sum+t;
        }
        int borrow=sum-n;
        if(sum>n){
            System.out.println(borrow);
        }else{
            System.out.println("0");
        }
    }
}
