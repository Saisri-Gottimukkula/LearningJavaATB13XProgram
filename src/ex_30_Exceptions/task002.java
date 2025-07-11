package ex_30_Exceptions;

public class task002 {
    public static void main(String[] args) {
        int[] marks= {1,2,3};
        try {
            int result= marks[2]/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
