import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        Boolean isPrime = true;

        if (num <= 1 ){
            System.out.println("Number is not prime number.");
        }
        else{
        for (int i = 2 ; i <= Math.sqrt(num) ; i++){
            if ( num % i == 0){
               isPrime = false; 
            }
        }

        if (isPrime == true) {
            System.out.println("Number is prime number.");   
        }else{
            System.out.println("Number is not prime number.");
        }
    }
    }
}
