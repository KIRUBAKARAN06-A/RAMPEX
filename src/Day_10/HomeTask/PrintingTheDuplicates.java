package Day_10.HomeTask;
public class PrintingTheDuplicates {
    public static void main(String[] args) {
            String[] arr = {"sam", "jane", "sam", "tom","sam","kiru","sam"};
            //for every name in the array
            //compare with the remaining elements
            //print the name if it matching
            for (int i = 0; i < arr.length; i++) {
                //System.out.println(arr[i]);
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j] && i != j && i<j) {
                        System.out.println(arr[j]);
                    }
                }
            }
        }
    }

