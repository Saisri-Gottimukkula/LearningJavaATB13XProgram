package ex_17_Task;

import java.util.Scanner;

public class Lab002_ex02 {
    public static void main(String[] args) {
        //Convert Days into Years, Months, and Days
        //Assume 1 year = 365 days.
        //Assume 1 month = 30 days
        //Convert the Days into Years, Month and days and Print it

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days");
        int inputdays = sc.nextInt();

        int years = inputdays / 365;
        int remainingDaysAfterYears = inputdays % 365;

        int months = remainingDaysAfterYears / 30;
        int days = remainingDaysAfterYears % 30;

        // Output
        System.out.println("Equivalent duration:");
        System.out.println(years + " year(s), " + months + " month(s), " + days + " day(s)");

    }
}
