package ex_11_java_Test;

import java.util.Scanner;

public class Lab008_Java_Test_08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an year");
        int year = scan.nextInt();

        if((year%4==0) || ((year%100==0) && (year%400==0))){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }

    }
}
