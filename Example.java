import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the age :");
        // int num = sc.nextInt();
        // if (num>=18) {
        // System.out.println("you can eligible to vote :");
        // }else{
        // System.out.println("you can not eligible to vote ");
        // }

        System.out.println("Enter the number  ");
        int day = sc.nextInt();
        // if (day == 1) {
        //     System.out.println("Sunday");
        // } else if (day == 2) {
        //     System.out.println("Tuesday");
        // } else {
        //     System.out.println("Wednesday");
        // }

        switch ( day) {
            case 1:
                System.out.println("Monday");
                break;
         case 2:
                System.out.println("Tuesday");
                break;
         case 3:
                System.out.println("Wednesday");
                break;
         case 4:
                System.out.println("Thursday");
                break;
          case 5:
                System.out.println("Friday");
                break;
          case 6:
                System.out.println("Satuarday");
                break;
           case 7:
                System.out.println("Sunday");
                break;     
        
            default:
                break;
        }
    }
}

