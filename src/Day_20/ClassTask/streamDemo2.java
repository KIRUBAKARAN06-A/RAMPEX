package Day_20.ClassTask;
import java.util.stream.Stream;
public class streamDemo2 {
    public static void main(String[] args){
        Stream.iterate(0,n->n+2).forEach(n->System.out.println(n));
    }
}
