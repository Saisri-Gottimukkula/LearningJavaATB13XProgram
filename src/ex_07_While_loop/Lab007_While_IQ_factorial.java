package ex_07_While_loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab007_While_IQ_factorial {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        int factorial = 1;

        if(n < 0){
            System.out.println("Negative Factorial is not allowed!");
            return; // it is used to break the loop. here we cannot use break because it is an if loop
        }

        if(n<=0){
            System.out.println(factorial);
        }else{
            // Calculate the factorial
            for (int i = 1; i <= n ; i++) {
                factorial = factorial*i;
            }
        }

        System.out.println("Factorial is -> " + factorial);


    }
}
