package Day_20.ClassTask;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;
import java.util.HashMap;
public class SecondMaxStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3};
        Arrays.stream(arr).sorted().skip(3).limit(1).forEach(n -> System.out.print(n));
        String name = "kirubakaran";
        //finding frequency using stream api
       // Stream<String> s = Stream.of(name);
        HashMap<Character, Integer>hm=new HashMap<Character,Integer>();
        Stream st = Stream.of('k','i','r','u','b','a','k','a','r','a','n');
        st.forEach(n->hm.put((Character)n,hm.getOrDefault(n,0)+1));
        System.out.print(hm);
       // Character[] ch =name.toCharArray();
      //  Arrays.stream(ch).

    }
}
