package Day_20.HomeTask;

public class occupyBooked {

        public static void main(String[] args) {

            for (int i = 1; i <= 15; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " - Occupy");
                } else {
                    System.out.println(i + " - Booked");
                }
            }
        }
    }

