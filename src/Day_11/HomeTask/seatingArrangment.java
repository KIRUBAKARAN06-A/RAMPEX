package Day_11.HomeTask;

public class seatingArrangment {

        public static void main(String[] args) {
            // Outer loop for 5 rows
            for (int r = 1; r <= 5; r++) {
                // Inner loop for 6 seats
                for (int s = 1; s <= 6; s++) {
                    System.out.print("R" + r + "S" + s + " ");
                }
                // Move to the next line after finishing a row
                System.out.println();
            }
        }
    }

