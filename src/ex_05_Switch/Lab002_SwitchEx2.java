package ex_05_Switch;

import java.util.Scanner;

public class Lab002_SwitchEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value");
        int day= scan.nextInt();

        switch (day)
        {
            case 1 :
                System.out.println("Sunday");

            case 2 :
                System.out.println("Monday");

            case 3 :
                System.out.println("Tuesday");

            case 4 :
                System.out.println("Wednesday");

            case 5 :
                System.out.println("Thursday");

            case 6:
                System.out.println("Friday");

            case 7 :
                System.out.println("Saturday");

            default :
                System.out.println("Not Allowed");

        }





    }
}

// what if there is no break in the switch case