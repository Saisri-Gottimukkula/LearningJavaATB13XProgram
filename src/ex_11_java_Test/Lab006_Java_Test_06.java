package ex_11_java_Test;

import java.util.Scanner;

public class Lab006_Java_Test_06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        if(number>0){
            System.out.println("Number is positive");
        }
        else if(number<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is Zero");
        }

    }
}
