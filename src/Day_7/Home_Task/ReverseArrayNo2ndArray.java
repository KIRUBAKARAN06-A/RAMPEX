package Day_7.Home_Task;
public class ReverseArrayNo2ndArray {
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            System.out.print("In-place Reversed Array: ");
            for (int num : arr) System.out.print(num + " ");
        }
    }


