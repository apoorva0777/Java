package Arrays;

import java.util.Scanner;

public class display_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        System.out.println("1.sum");
        System.out.println("2.reverse");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        switch(num){
            case 1:
                int sum = 0;
                for (int nu : arr) {
                    sum += nu;
                }
                System.out.println(sum);
                break;
            case 2:
                int i=0;
                int j=arr.length -1;
                while(i<=j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;
                }
                System.out.println(arr);

        }
    }
}
