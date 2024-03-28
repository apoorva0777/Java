import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no : ");
        int n = sc.nextInt();
        int sum=0;
        int original=n;
        while(original>0){
            int digit =original%10;
            sum+=digit;
            original=original/10;
        }
     System.out.println("sum is : "+ sum);
        int ans=0;
        int reverse=n;
        while(reverse>0){
            int rem=reverse%10;
            ans=ans*10+rem;
            reverse=reverse/10;

        }
        System.out.println("reversed number is:" + ans);
    }


}
