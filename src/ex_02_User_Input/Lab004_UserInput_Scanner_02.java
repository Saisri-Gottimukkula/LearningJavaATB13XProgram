package ex_02_User_Input;

import java.util.Scanner;

public class Lab004_UserInput_Scanner_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = scanner.next();
        System.out.println(name);

        System.out.println("Enter a integer");
        int num = scanner.nextInt();
        System.out.println(num);

        System.out.println("Enter a double");
        double value = scanner.nextDouble();
        System.out.println(value);
    }
}
