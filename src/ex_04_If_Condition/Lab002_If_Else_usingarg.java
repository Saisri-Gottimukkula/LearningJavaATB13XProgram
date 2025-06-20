package ex_04_If_Condition;

import java.util.Scanner;

public class Lab002_If_Else_usingarg {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
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

//here you are giving arguments in the file configuration