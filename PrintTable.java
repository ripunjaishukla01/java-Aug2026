
//   Table 

// import java.util.Scanner;

// public class PrintTable {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int num = sc.nextInt();
//         for(int i= 1;i<=10;i++){
// System.out.println(num + " * " + i+ " = " + i*num);
//         }
//     }
// }

// factorial

// import java.util.Scanner;
// public class PrintTable {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int fact = 1;
//         for(inti =1;i<=n;i++){
//             fact= fact*i;
//         }
//         System.out.println(n + " Factorial is : " + fact );
//         // System.out.println(fact);
//     }
// }

// Natural Number

// import java.util.Scanner;

// public class PrintTable {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int sum = 0;
//         for (inti = 1; i <= n; i++) {
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
// }


//           Even Odd Number
import java.util.*;
public class PrintTable {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
//         if (n%2==0){
//             System.out.println("eveen");
//         }else{
//             System.out.println("odd");
//         }

//     }
// }



while(n%2==0){
       System.out.println("even number ");
       n++;
}
System.out.println("odd");
    }}