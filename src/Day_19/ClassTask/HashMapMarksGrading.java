package Day_19.ClassTask;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
public class HashMapMarksGrading {
        public static void main(String[] args) {
            //Create a HashMap add Name, Mark values
            HashMap<String, Integer> hm = new HashMap<String, Integer>();
            hm.put("kiruba", 91);
            hm.put("karan", 96);
            hm.put("haran", 94);
            hm.put("hari", 99);
            hm.put("Deek", 98);
//        System.out.println(hm.entrySet());
            int max = 0;
            String name = "";
            for(Map.Entry<String,Integer> e: hm.entrySet()){
                if(e.getValue()>max) {
                    max = e.getValue();
                    name = e.getKey();
//                System.out.println(max);
//                System.out.println(name);
                }
            }
            System.out.println(max);
            System.out.println(name);
        }
    }