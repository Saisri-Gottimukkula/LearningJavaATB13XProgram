package ex_30_Exceptions;
//nested try catch
public class task003 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

            int[] mark = {10, 20, 30};
            try {
                System.out.println(mark[6]);
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println(e.getMessage());
            }
            System.out.println("Program continues after nested try-catch.");


        }
    }
}
