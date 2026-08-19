//   Fibonacci Series

// import java.util.Scanner;

// public class example9 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//          int n = sc.nextInt();
//          int a = 0 , b = 1;
//          System.out.print("Fibonacci Series:");
//          for (int i = 0; i < n; i++) {
//             System.out.print(a+" ");
//             int c = a+b;
//                   a = b;
//                   b = c;   

//          }
//     }
// }

//                                     pyramid 

// import java.util.Scanner;

// public class example9 {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number : ");
//     int n = sc.nextInt();
//      for (int i = 1; i < n; i++) {
//         for (int j = 1; j < n-i; j++) {
//             System.out.print("  ");
//         }
//             for (int j = 1; j<=i; j++) {
//             System.out.print(i+"  ");

//         }
//         System.out.println();
//      }
// }
// }

//    rectangle pattern

// import java.util.Scanner;

// public class example9 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows :");
//         int rows = sc.nextInt();
//         System.out.print("Enter the Column");
//         int column = sc.nextInt();
//          for (int i = 1; i <= rows ; i++) {
//             for (int j = 1; j <=column; j++) {
//                 if (i==1||j==1||i==rows||j==column) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//            System.out.println(); 
//          }
//     }
// }


// pattern print 

// import java.util.Scanner;

// public class example9{
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         System.out.print("Enter the number :");
//            int n = sc.nextInt();
//            for (int i = 1; i <=n; i++) {
//             for (int j = 1; j <=n-i; j++) {
//                System.out.print(" "); 
            
//             }for (int j = 1; j <=i; j++) {
//             System.out.print("*");    
//             }
          
           
//            System.out.println();
//     }
// }}


// patterm 

// import java.util.Scanner;

// public class example9 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number ");
//          int n = sc.nextInt();
//          int num = 1;
//          for (int i = 1 ; i <=n ; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num+ " ");
//                 num++;
                   
//                 if (n==num) {
//                    n = 1; 
//                 }
//             }
//             System.out.println(" ");
//          }
       
//     }
// }




import java.util.*;
import java.util.stream.*;

public class example9 {

    


    public static void main(String[] args) {

        List<Integer> number =
                Arrays.asList(1, 0, -3, 0, 5, -2, 0, 8, 0, -4);

        List<Integer> result = Stream.concat(
                number.stream().filter(n -> n != 0),
                number.stream().filter(n -> n == 0)
        ).collect(Collectors.toList());

        System.out.println(result);
    }
}