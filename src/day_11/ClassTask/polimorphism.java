package day_11.ClassTask;

public class polimorphism {
    public static void main(String [] args){

            greet();
            greet("karan","kiruba");
            greet(20);
        }
        //same thing behaving differently in different scenarios
        public static void greet(){
            System.out.println("Good Afternoon");
        }
        public static void greet(String name){
            System.out.println("Good Afternoon " + name);

        }
        public static void greet(String name, String name2){
            System.out.println("Good Afternoon both of you " + name2);

        }
        public static void greet(int age){
            System.out.print("Good Afternoon, your age is " + age);

        }
    }

