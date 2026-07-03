package day_11.HomeTask;

public class ShortCircuitExample {
    public static void main(String[] args) {
            int x = 5;

            if (x > 10 && ++x > 5) {
                // This block will not execute
            }

            System.out.println("x: " + x); // Output: 5
        }
    }

