package Day_13.HomeTask;

public class Pattern {

        public static void main(String[] args) {

            int n = 6;

            for (int i = 1; i <= n; i++) {

                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print alphabets
                char ch = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                    ch++;
                }

                System.out.println();
            }
        }
    }

