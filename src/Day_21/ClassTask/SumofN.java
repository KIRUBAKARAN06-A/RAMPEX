package Day_21.ClassTask;

public class SumofN {
    public static void main(String[] args) {
        int sum =0;
        System.out.println( adder( 1,sum));
    }

    public static int adder(int num, int sum) {

        if (num == 5) {
            return sum;  //base case
        }
        sum = sum + num;
        num++;
        System.out.println(sum);

       return  adder(num,sum);
    }
}
