package ex_30_Exceptions;

import java.util.Scanner;

public class Lab011_Why_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter v");
        int v = sc.nextInt();

        try{
            int b = 10/v;
            System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        /* sc.close(); //if i write here this will not get executed but if we write in finally block the code will
        execute definetly */
        finally {
            sc.close();
            System.out.println("End of the program, sc closed !");
        }
    }


}
