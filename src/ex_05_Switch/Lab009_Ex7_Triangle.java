package ex_05_Switch;

import java.util.Scanner;

public class Lab009_Ex7_Triangle {
    public static void main(String[] args) {
        //int triangle = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values a,b,c :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if((a == b) && (b == c))
        {
            System.out.println("equilateral triangle");
        } //else if (((a==b) && (b!=c)) || ((a==c) && (c!=b)) || ((b==c) && (a!=b)))
        else if ( (a==b) || (b==c) || (a==c))
        {
            System.out.println("isosceles triangle");
        }
        else
        {
            System.out.println(("scalene triangle"));
        }


    }
}
