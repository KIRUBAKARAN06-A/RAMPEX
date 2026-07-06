package Day_13.HomeTask;

public class MergeTwoString2 {

        public static void main(String[] args) {
            int[] a = {2, 6, 8, 10, 15};
            int[] b = {1, 3, 9, 20};

            int i = 0, j = 0;

            while (i < a.length && j < b.length) {
                if (a[i] < b[j])
                    System.out.print(a[i++] + " ");
                else
                    System.out.print(b[j++] + " ");
            }

            while (i < a.length)
                System.out.print(a[i++] + " ");

            while (j < b.length)
                System.out.print(b[j++] + " ");
        }
    }

