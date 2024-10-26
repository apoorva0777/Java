package codeforces_questions;

import java.util.Scanner;

public class Rectangle_arrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int maxW = 0, maxH = 0;

            for (int i = 0; i < n; i++) {
                int w = sc.nextInt();
                int h = sc.nextInt();

                maxW = Math.max(maxW, w);
                maxH = Math.max(maxH, h);
            }
            int minPerimeter = 2 * (maxW + maxH);
            System.out.println(minPerimeter);
        }

        sc.close();
    }
}
