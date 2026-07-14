package Day_21.ClassTask;

public class Fibo {
    public static void main(String[] args){
     // fibo(2);
     //for(int i=0; i<= 10; i++) {

          System.out.println(fibo(8));
     // }
    }
    public static int fibo(int n){
      if(n==0){return 0;}
         else if(n==1){return 1;}
        return fibo(n-1)+ fibo(n-2);
    }
}
