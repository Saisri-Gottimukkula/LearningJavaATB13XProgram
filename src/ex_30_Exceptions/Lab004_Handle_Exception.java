package ex_30_Exceptions;

public class Lab004_Handle_Exception {
    public static void main(String[] args) {

        int a = 0;
        try {
            a = 10/a; //.ArithmeticException
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Div by zero not allowed"); //we can put our own custom message
        }

        System.out.println(a);
    }
}


/* Checked - JVM
    JVM knows about it, During compilation - JVM is saying that there can be case when this file is not found

    JVM knows this may lead to file not found exception. So it is telling to handle it
 */