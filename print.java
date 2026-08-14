import java.util.*;
public class print {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        for (int i = 1;i<= n;i++){
            for(int j= i;j<=n;j--)
            
                System.out.print(i +"  ");
                System.out.println(" ");
        }
        System.out.println("");
    }
}
   


    //  2 program 

    // import java.util.*;
    // public class print{
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         System.out.print("Enter the number :");
    //         int num = sc.nextInt();
    //         for (int i = num; i >= 1; i--) {
    //         for (int j = num; j > i; j--) {
    //        System.out.print(" ");
    //         }
    //         for(int j = 1; j<=i;j++){
    //          System.out.print("*");
    //         }    
    //     System.out.println();
    //     }
    //     }}