package day_11.ClassTask;
import java.util.Scanner;
public class PhoneCall {
    public static void main(String [] args){
        iphone p1 = new iphone();
        p1.call();
        p1.message();
        p1.photo();
    }
}
abstract  class phone{
    public   abstract  void call();
    public  abstract  void message();
    public abstract void photo();
}
class iphone extends phone{
    public void call() {
        System.out.println("calling from iphone");
    }
    public void message(){
        System.out.println("messaage from iphone");
    }
    public void photo(){
        System.out.println("photo captured by iphone");
    }
}
