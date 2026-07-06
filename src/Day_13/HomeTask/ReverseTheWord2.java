package Day_13.HomeTask;

public class ReverseTheWord2 {

        public static void main(String[] args) {
            String str = "Welcome to Chennai";
            String[] words = str.split(" ");

            for (String word : words) {
                for (int i = word.length() - 1; i >= 0; i--) {
                    System.out.print(word.charAt(i));
                }
                System.out.print(" ");
            }
        }
    }

