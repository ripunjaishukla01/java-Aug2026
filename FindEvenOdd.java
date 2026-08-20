
// Find ODD or Even number in Java \\

// import java.util.Scanner;

// public class FindEvenOdd {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number :");

// try {
// int n = sc.nextInt();
// if (n % 2 != 0) {
// System.out.println("This is Odd number :");
// } else {
// System.out.println("This is Even number ");
// }
// } catch (Exception e) {
// System.out.println("Enter the only number ");
// }
// }
// }

// Find the prime number in java \\

import java.util.Scanner;

public class FindEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
