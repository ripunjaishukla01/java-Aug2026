import java.sql.SQLOutput;
import java.util.*;
public class EvenOdd {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("eveen");
        }else{
            System.out.println("odd");
        }

    }
}
