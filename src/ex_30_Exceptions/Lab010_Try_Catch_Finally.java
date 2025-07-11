package ex_30_Exceptions;

public class Lab010_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            b = 10 / a;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); //detailed message
        }
        finally { //this will print always
            System.out.println("I will be always executed!");
        }

    }
}