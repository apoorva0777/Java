import java.util.Scanner;

public class ODDEVEN {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("enter no. ");
        int number = inp.nextInt();
        if(number %2 ==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
        System.out.println("you entered: " + number);
    }
}
