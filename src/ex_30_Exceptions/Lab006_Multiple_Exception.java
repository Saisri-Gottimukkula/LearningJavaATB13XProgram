package ex_30_Exceptions;

public class Lab006_Multiple_Exception {
    public static void main(String[] args) {
        System.out.println("1");
        try {
           int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Are you fool");
        }
        catch (Exception e) {
            System.out.println("Are you fool too");
        }
        System.out.println("2");
    }
}


/* we can write multiple catch block but we need to keep in mind that we should write in smaller to bigger exception
ex. Arithmetic exception -> exception. we cant write directly exception
 */