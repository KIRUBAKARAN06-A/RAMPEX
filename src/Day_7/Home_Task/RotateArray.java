package Day_7.Home_Task;
public class RotateArray {
    public static void main(String [] args){
            int[] arr = {10, 20, 30, 40, 50};
            int lastElement = arr[arr.length - 1];

// Step 2: Shift elements right starting from the back
            int i = arr.length - 1;
            while (i > 0) {
                arr[i] = arr[i - 1];
                i--;
            }

// Step 3: Move saved element to front
            arr[0] = lastElement;

// Printing rotated array
            System.out.print("Right Rotated 1x Array: ");
            for (int num : arr) System.out.print(num + " ");
// Output: 50 10 20 30 40
        }
    }
