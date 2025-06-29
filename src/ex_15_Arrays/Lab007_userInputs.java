package ex_15_Arrays;

import java.util.Scanner;

public class Lab007_userInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        int [] numbers_marks = new int[size];
        for(int i=0; i<= numbers_marks.length; i++){
            System.out.println("enter the numbers");
            numbers_marks[i] = sc.nextInt();
        }

        System.out.println("----------------");

        for(int i=0; i<= numbers_marks.length; i++){
            System.out.println(numbers_marks[i]);
        }


    }
}
