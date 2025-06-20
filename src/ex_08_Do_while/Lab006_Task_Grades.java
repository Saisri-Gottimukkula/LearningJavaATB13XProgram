package ex_08_Do_while;

import java.util.Scanner;

public class Lab006_Task_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter score between 0 to 100");
        int score = scan.nextInt();

        if((score<0 || score>100)){
            System.out.println("Invalid. Please enter a value between 0 to 100");
            return;
        }

        if(score>=90){
            System.out.println("Grade is A");
        }
        else if(score>=80){
            System.out.println("Grade is B");
        }
        else if(score>=70){
            System.out.println("Grade is C");
        }
        else if(score>=60){
            System.out.println("Grade is D");
        }
        else{
            System.out.println("Grade is F");
        }
    }
}
