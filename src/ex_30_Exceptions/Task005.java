package ex_30_Exceptions;

public class Task005 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Manually thrown ArithmeticException");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}
