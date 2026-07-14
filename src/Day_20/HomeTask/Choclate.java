package Day_20.HomeTask;
import java.util.Scanner;
public class Choclate {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of chocolates: ");
            int chocolates = sc.nextInt();

            System.out.print("Enter number of days: ");
            int days = sc.nextInt();

            System.out.print("Enter chocolates consumed per day: ");
            int perDay = sc.nextInt();

            if (chocolates >= days * perDay) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            sc.close();
        }
    }

