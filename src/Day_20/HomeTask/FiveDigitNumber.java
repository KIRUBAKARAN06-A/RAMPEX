package Day_20.HomeTask;
import java.util.Scanner;
public class FiveDigitNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int count = String.valueOf(Math.abs(num)).length();

            System.out.println("Number of digits = " + count);

            if (count == 5) {
                System.out.println("It is a 5-digit number");
            } else {
                System.out.println("It is not a 5-digit number");
            }

            sc.close();
        }
    }

