package ex_11_java_Test;

import java.util.Scanner;

public class Lab007_Java_Test_07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers a, b, c");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if (b>a && b>c) {
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }


    }
}
