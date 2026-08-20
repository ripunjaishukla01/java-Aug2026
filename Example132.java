
// Swapping the String

import java.util.Scanner;

public class Example132 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name :");
        String str = sc.nextLine();
        System.out.print("Enter the second name :");
        String str1 = sc.nextLine();
        System.out.println("Before Swapping a = " + str + " b = " + str1);
        String temp = str;
        str = str1;
        str1 = temp;

        System.out.print("After Swapping a = " + str + " b = " + str1);

    }
}

// largest Three number

// import java.util.Scanner;

// public class Example132 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the first number - ");
// int a = sc.nextInt();
// System.out.print("Enter the second number ");
// int b = sc.nextInt();
// System.out.print("Enter the third number ");
// int c = sc.nextInt();
// if (a > b && a > c) {
// System.out.println("The largest number is - " + a);
// } else if (b > a && b > c){
// System.out.println("The largest number is - "+ b);
// }else{
// System.out.println("The largest number is - "+ c);
// }
// }
// }
