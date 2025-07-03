package ex_17_Task;

import java.util.Scanner;

public class Lab001_ex01 {
    public static void main(String[] args) {
        //Check if a Number is Divisible by 5 and 11

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num%5 == 0 && num%11 == 0){
            System.out.println("Number is divisible by 5 and 11");
        }
        else{
            System.out.println("number is not divisible by 5 and 11");
        }
    }
}
