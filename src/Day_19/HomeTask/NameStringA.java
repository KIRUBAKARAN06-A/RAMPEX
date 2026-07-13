package Day_19.HomeTask;
import java.util.Arrays;
public class NameStringA {
    public static void main(String[] args) {

            String[] names = {"Arun", "Bala", "Ajay", "Kiran", "Akash", "Vignesh"};

            Arrays.stream(names)
                    .filter(name -> name.startsWith("A"))
                    .forEach(System.out::println);
        }
    }

