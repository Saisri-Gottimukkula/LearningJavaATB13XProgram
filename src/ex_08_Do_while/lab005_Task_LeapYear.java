package ex_08_Do_while;

import java.util.Scanner;

public class lab005_Task_LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scan.nextInt();


        if((year%4==0)  || (year%100!=0) && (year%400==0)) {
            System.out.println("Yes, It is a leap year");
        }
        else{
            System.out.println("Its not a leap year");
        }
    }
}
