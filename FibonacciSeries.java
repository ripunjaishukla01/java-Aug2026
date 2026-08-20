import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int m = 0, n = 1, next;
        for (int i = 1; i <= num; i++) {
            System.out.print(m + " ");
            next = m + n;
            m = n;
            n = next;
        }
    }
}