package ex_30_Exceptions;

public class Task006 {
    public static void main(String[] args) {
        try {
            System.out.println("Statement 1: Start");

            int result = 10 / 0;  // This will throw ArithmeticException

            System.out.println("Statement 2: Won't be executed");
            System.out.println("Statement 3: Won't be executed either");

        } catch (ArithmeticException e) {
            System.out.println("Catch block: Exception caught - " + e);
        }

        System.out.println("Program continues after try-catch.");
    }
}
