package ex_17_Task;

import java.util.Scanner;

//Check if a Number is an Armstrong Number.
public class Lab013_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;

        int n = 0;
        int temp = num;
        while(temp!=0){
            temp /= 10;
            n++;
        }

        temp = num;

        // Calculate sum of digits each raised to the power n
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }

        // Check Armstrong condition
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }



    }
}
