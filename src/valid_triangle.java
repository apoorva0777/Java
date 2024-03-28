import java.util.Scanner;

public class valid_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter 1st angle");
        int first = input.nextInt();
        Scanner cc = new Scanner(System.in);
        System.out.print("enter 2nd angle");
        int second = cc.nextInt();
        Scanner ss = new Scanner(System.in);
        System.out.print("enter 3rd angle");
        int third = ss.nextInt();
if(first+second+third==180){
    System.out.println("valid triangle");
}else{
    System.out.println("invalid triangle");
}

    }
}
