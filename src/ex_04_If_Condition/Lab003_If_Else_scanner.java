package ex_04_If_Condition;

import java.util.Scanner;

public class Lab003_If_Else_scanner {
        public static void main(String[] args) {
            System.out.println("Enter age : ");
            Scanner scan = new Scanner(System.in);
            int age = scan.nextInt();

            if(age>=18)
            {
                System.out.println("You are allowed to vote");
            }
            else
            {
                System.out.println("you are not allowed to vote");
            }
        }
    }

