package ex_02_User_Input;

import java.util.Scanner; //inbuilt class

public class Lab003_UserInput_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age :");

        int age = scanner.nextInt();
        String canIvote = age >=18 ? "Yes" : "No";
        System.out.println(canIvote);

    }
}
