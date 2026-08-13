import java.sql.SQLOutput;
import java.util.*;
public class Whileloop {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int i = 0;
        while(n%2==0){
            System.out.println("This is even number");
            i++;
        }
        System.out.println("This is odd number");
    }
}
