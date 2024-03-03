import java.util.Scanner;
public class Practice6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int end = 0;
        do{
            System.out.print("Enter first number: ");
            int x = scan.nextInt();
            System.out.print("Enter second number: ");
            int y = scan.nextInt();
            System.out.println(x+" * "+y+ " = " + x*y);

            System.out.println("Enter <1> if you want to stop the multiplication. Enter any other number, if you want to proceed");
            end = scan.nextInt();

        } while (end != 1);




    }
}
