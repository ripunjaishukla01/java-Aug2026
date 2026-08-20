
import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num = sc.nextInt();
        System.out.print("Enter the second number :");
        int num1 = sc.nextInt();
        System.out.println("Before swapping a = " + num + " b = " + num1);
        num = num + num1;
        num1 = num - num1;
        num = num - num1;
        System.out.print("After swapping a = " + num + " b =" + num1);
    }
}
