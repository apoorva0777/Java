package String;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = " ";
        int ptr = a.length() - 1;
        while (ptr >= 0) {
            b = b + a.charAt(ptr);
            ptr--;
        }
        System.out.print(b);
    }
}
