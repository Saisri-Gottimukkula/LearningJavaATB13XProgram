package ex_30_Exceptions;

public class task001 {
    public static void main(String[] args) {
        int a =0;
        try {
            a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch(Exception e){
            System.out.println("Exception");
        }


    }
}
