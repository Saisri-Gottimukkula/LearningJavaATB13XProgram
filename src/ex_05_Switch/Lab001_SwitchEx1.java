package ex_05_Switch;

import java.util.Scanner;

public class Lab001_SwitchEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value");
        int day= scan.nextInt();

        switch (day)
        {
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Not Allowed");
                break;
        }





    }
}
//Syntax - Switch statement
//switch(expression)
//
//        `{`
//
//        ` // case statements`
//
//        ` // values must be of same type of expression`
//
//        ` case value1 : expression = value 1 -> `
//
//        ` // Statements`
//
//        ` break; // break is optional`
//
//        ` case value2 :`
//
//        ` // Statements`
//
//        ` break; // break is optional`
//
//        `default:`
//
//        `break;`
//
//        `}`

