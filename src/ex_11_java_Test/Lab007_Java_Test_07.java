package ex_11_java_Test;

import java.util.Scanner;

public class Lab007_Java_Test_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers a, b, c");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a == b) && (b == c)) {
            System.out.println("All are equal");
        }

        else if (a == b && a > c) {
            System.out.println("Largest Number is: " + a);
        }


        else if(a == c && a > b) {
            System.out.println("Largest Number is: " + a);
        }

        else if(b == c && b > a) {
            System.out.println("Largest Number is: " + b);
        }

        else if(a>b && a>c){
            System.out.println("Largest Number is: " + a);
        }

        else if(b>a && b>c) {
            System.out.println("Largest Number is: " + b);
        }

        else if(c>a && c>b){
            System.out.println("Largest Number is: " + c);
        }
    }

}
