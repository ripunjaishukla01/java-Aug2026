//import java.util.Scanner;
//
//public class factoria1 {
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int n = sc.nextInt();
//        int fact = 1;
//        int i = 1;
//        do {
//         fact = fact *i;
//           i++;
//        } while (i<=n);
//System.out.println(fact);
//    }
//
//}


//       using if else Statement


import java.util.Scanner;

public class factoria1 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i = 1;
        int fact = 1;
         if(i<n){
                fact = fact*i;
                i++;
         }else{
            System.out.println(fact);
         }
    }}