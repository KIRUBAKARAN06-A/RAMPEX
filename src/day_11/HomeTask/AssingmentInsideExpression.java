package day_11.HomeTask;

public class AssingmentInsideExpression {

        public static void main(String[] args) {
            int a = 10;

            int b = (a = 20) + a;

            System.out.println("a: " + a); // Output: 20
            System.out.println("b: " + b); // Output: 40
        }
    }

