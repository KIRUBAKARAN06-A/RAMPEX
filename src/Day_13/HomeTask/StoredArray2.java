package Day_13.HomeTask;

public class StoredArray2 {

        public static void main(String[] args) {
            int[] arr = {12, 18, 25, 20, 30, 40};

            boolean sorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted)
                System.out.println("Sorted");
            else
                System.out.println("Not Sorted");
        }
    }

