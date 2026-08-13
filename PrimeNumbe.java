import java.util.Scanner;

public class PrimeNumbe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(i%2!=0){
                 System.out.println("PrimeNumbe");
            }else {
                System.out.println("");
            }

        }

        
    }
}
