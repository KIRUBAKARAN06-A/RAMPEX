package Day_8.ClassTask;
import java.util.Scanner;
public class ReverseName {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name :");
            String name = sc.nextLine();
            int n = name.length();
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }

