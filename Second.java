

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
        String str = sc.nextLine();
        String rev = "";

        for (int i = str.length() - 1; i >(-1); i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);

    
    }
}
