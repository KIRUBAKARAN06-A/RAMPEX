package Day_21.HomeTask;
import java.util.*;
public class EvenSum {
    public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

            int sum = list.stream()
                    .filter(n -> n % 2 == 0)
                    .mapToInt(n -> n)
                    .sum();

            System.out.println(sum);
        }
    }

