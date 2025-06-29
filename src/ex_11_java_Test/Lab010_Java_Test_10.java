package ex_11_java_Test;

import java.util.Scanner;

public class Lab010_Java_Test_10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2");
        int num2 = scan.nextInt();
        System.out.println("Enter operators +, -, *, /");
        String operator = scan.next();

        switch(operator){
            case "+" :
                int add = num1+num2;
                System.out.println("addition: " + add);
                break;
            case "-" :
                int sub = num1-num2;
                System.out.println("subtraction: " + sub);
                break;
            case "*" :
                int mul = num1*num2;
                System.out.println("multiplication: " + mul);
                break;
            case "/" :
                if(num2==0){
                    System.out.println("Enter a valid number");
                    return;
                }

                int div = num1/num2;
                System.out.println("division: " + div);
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
