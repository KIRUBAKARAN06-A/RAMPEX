package Day_20.HomeTask;
import java.util.Scanner;
public class StockPrice {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter purchase price: ");
            int purchasePrice = sc.nextInt();

            System.out.print("Enter current price: ");
            int currentPrice = sc.nextInt();

            System.out.print("Enter number of stocks: ");
            int quantity = sc.nextInt();

            int purchaseAmount = purchasePrice * quantity;
            int currentAmount = currentPrice * quantity;

            if (currentAmount > purchaseAmount) {
                System.out.println("Profit = " + (currentAmount - purchaseAmount));
            } else if (currentAmount < purchaseAmount) {
                System.out.println("Loss = " + (purchaseAmount - currentAmount));
            } else {
                System.out.println("No Profit No Loss");
            }

            sc.close();
        }
    }

