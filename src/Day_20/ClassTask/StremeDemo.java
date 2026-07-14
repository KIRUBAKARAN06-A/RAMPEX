package Day_20.ClassTask;
import java.util.*;
public class StremeDemo {
    public static void main(String[] args){
        int [] arr = {4,3,7,8,2,1,9,10,6};
 //       Arrays.stream(arr).filter((n)->n%2==0).sorted().forEach(n->System.out.println(n));
//    above line for even number
        Arrays.stream(arr).filter((n)->n%2!=0).sorted().forEach(n->System.out.println(n));
  //    this above line for odd number
        //using ArrayList
        ArrayList<Integer> li = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        li.add(3);

       li.stream().sorted().forEach((n)->System.out.println(n));
   //    System.out.println(li);
      // li.stream().map(n->*2).forEach(n->System.out.println(n));
    }
}
