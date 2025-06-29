package ex_11_java_Test;

import java.util.Scanner;

public class Lab011_Java_Test_11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        for (int i=1; i<=num; i++){
            System.out.printf(" " + i);
        }
    }
}
