package ex_30_Exceptions;

import java.util.Scanner;

public class Lab016_TryCatch_throws_throw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    static void validateAge(int age) throws Exception,ArithmeticException, NumberFormatException {
        if(age<18){
            throw new Exception("You are minor, Cant go to Goa !");
        }
    }
}


//throws can have multple exception
//throw cannot have multiple exception