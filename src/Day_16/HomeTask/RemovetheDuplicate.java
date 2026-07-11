package Day_16.HomeTask;
import java.util.ArrayList;
public class RemovetheDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(4);
            list.add(5);
            for (int i = 0; i < list.size(); i++) {
                while (list.lastIndexOf(list.get(i)) != i) {
                    list.remove(list.lastIndexOf(list.get(i)));
                }
            }

            System.out.println(list);
        }
    }


