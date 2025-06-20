package ex_05_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab003_Real_Automation_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser = scan.next(); //we are using next as it is a string
        browser=browser.toLowerCase();//if we enter lowercase also it will take

        switch(browser)
        {
            case "chrome" :
                System.out.println("Hi this is chrome");
                System.out.println(".....");
                break;
            case "Edge" :
                System.out.println("Hi this is Edge");
                System.out.println(".....");
                break;
            case "Opera" :
                System.out.println("Hi this is Opera");
                System.out.println(".....");
                break;
            default :
                System.out.println("Hi this is not valid");
                System.out.println(".....");
                break;
        }

    }
}
