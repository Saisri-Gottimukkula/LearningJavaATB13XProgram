package ex_11_java_Test;

import java.util.Scanner;

public class Lab005_Java_Test_05 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer and a decimal number");
        int integer = sc.nextInt();
        double decimal = sc.nextDouble();

        int expression_result = integer + (int)(integer+decimal);
        System.out.println("Expression result: " + expression_result);

        double implicit_casting = integer + decimal;
        System.out.println("Implicit casting: " + implicit_casting);

        int explicit_casting = integer + (int)decimal;
        System.out.println("explicit_casting: " + explicit_casting);

    }
}
