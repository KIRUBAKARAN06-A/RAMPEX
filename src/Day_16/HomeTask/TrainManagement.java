package Day_16.HomeTask;
import java.util.LinkedList;
public class TrainManagement {
    public static void main(String[] args) {

            LinkedList<String> train = new LinkedList<>();

            train.addFirst("Engine");
            train.add("Coach1");
            train.add("Coach2");
            train.addLast("Guard");

            train.removeLast();

            System.out.println(train);
        }
    }

