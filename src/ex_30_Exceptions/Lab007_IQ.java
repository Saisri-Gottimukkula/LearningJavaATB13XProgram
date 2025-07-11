package ex_30_Exceptions;

import java.util.Arrays;

public class Lab007_IQ {
    public static void main(String[] args) {
        /*String name = null;
        try {
            name.trim(); //NullPointerException
        } catch (Exception e) {
            System.out.println("null error");
        }

        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("Arithmetic exception");;
        }
        System.out.println("end");*/

        //instead of writing like this we can write in this way

        String name = null;

        try{
            name.trim();
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("null or arithmetic exception");
        }

    }
}
