package ex_02_User_Input;

import java.sql.SQLOutput;

public class Lab002_UserInputCLI2 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[10]);
    }
}

//we are getting below error for 10 as we didnt pass any arguments in the configuration file for 10
