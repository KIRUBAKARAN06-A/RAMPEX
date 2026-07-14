package Day_21.HomeTask;
public class FirstLastNumber {
    public static void main(String[] args) {
            int num = 153;
            int last = num % 10;
            int first = num;

            while (first >= 10) {
                first = first / 10;
            }

            int sum = first + last;

            System.out.println("First digit = " + first);
            System.out.println("Last digit = " + last);
            System.out.println("Sum = " + sum);
        }
    }

