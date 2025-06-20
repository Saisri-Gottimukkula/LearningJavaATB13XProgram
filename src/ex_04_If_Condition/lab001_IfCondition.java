package ex_04_If_Condition;

import java.util.Scanner;

public class lab001_IfCondition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = scan.nextInt();
        if(age>=18)
        {
            System.out.println("You are allowed to vote !");
        }
    }
}
//here we added only if block so if we give number less than 18 it wont print