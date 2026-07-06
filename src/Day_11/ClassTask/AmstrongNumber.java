package Day_11.ClassTask;

public class AmstrongNumber {


    public static void main(String[] args) {
        System.out.print(checkAmstrong(47));
    }
    // check Amstrong

    public static boolean checkAmstrong(int num) {
        int temp = num;
        int original=num;
        int digit = 0;

        // count how many digits in a number
        //47
        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }
        // System.out.print("num of digit : "+digit);
        int sum = 0;
        int rem;
        while (num != 0) {

            rem = num % 10;
            sum = sum + (int) (Math.pow(rem, digit));
            num = num / 10;
        }
        System.out.println(" The Ams sum is : " + sum);
        if (original == sum) {
            return true;

        } else {
            return false;

        }
    }
}
