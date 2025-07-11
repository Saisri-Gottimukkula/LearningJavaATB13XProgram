package ex_30_Exceptions;

public class Lab009 {
    public static void main(String[] args) {
        int a = 0;//this should not be written in try catch
        int b = 0; //this should not be written in try catch

        try{
            b = 10/a; //only vulnerable code that should be try catch
            System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Expression");
        }

        System.out.println("End");

    }
}
