/*
For each month, the bank adds 7% of the amount to the deposit amount.
A program in which the user enters the deposit amount and the number of months.
The bank calculates the final amount of the deposit (while loop).
 */
import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the deposit amount: " );
        float deposit = scan.nextFloat();
        System.out.print("Enter the deposit term in months: ");
        int month = scan.nextInt();
        int i = 1;

        while(i <= month){
            deposit += (float) (deposit*0.07);
            i++;
        }
        System.out.println("After " + month + " month the deposit amount will be: " + deposit);

    }
}
