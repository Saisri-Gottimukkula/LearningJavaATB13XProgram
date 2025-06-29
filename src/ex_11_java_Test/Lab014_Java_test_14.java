package ex_11_java_Test;

import java.util.Scanner;

public class Lab014_Java_test_14 {
    public static void main(String[] args) {

        //right triangle pattern

        for(int i=0; i<=3; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //Pyramid
        for (int i = 1; i <= 4; i++) {//for printing rows
            // print spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            // print stars: (2 * i - 1) gives 1, 3, 5, etc.
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            // move to next line after each row
            System.out.println();
        }
    }
}
