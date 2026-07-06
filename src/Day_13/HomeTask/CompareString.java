package Day_13.HomeTask;

public class CompareString {


        public static void main(String[] args) {
            String str = "aaabbccccdd";

            int count = 1;

            for (int i = 0; i < str.length(); i++) {
                if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    System.out.print(str.charAt(i));
                    System.out.print(count);
                    count = 1;
                }
            }
        }

    public static class CheckArrayStored2 {

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

    public static class CompareString2 {

            public static void main(String[] args) {
                String str = "xxxxxyzz";

                int count = 1;

                for (int i = 0; i < str.length(); i++) {
                    if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                        count++;
                    } else {
                        System.out.print(str.charAt(i));
                        System.out.print(count);
                        count = 1;
                    }
                }
            }
        }
}

