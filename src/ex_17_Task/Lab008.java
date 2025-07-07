package ex_17_Task;
/*Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
Take the below User info and store it into the variables:
Age (integer),Salary (double or float),Credit Score (integer)

Age Validation:
Check if the age is a positive integer.
Ensure the age is at least 18 years old.
Max age can be 80.

Salary Validation:
Check if the salary is a positive number.
Define a minimum salary threshold (e.g., 30,000).

Credit Score Validation:
Check if the credit score is a positive integer.
Define a minimum credit score threshold (e.g., 650).
Max credit score threshold (e.g., 850).*/

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age, salary, credit score");
        int Age = sc.nextInt();
        double Salary = sc.nextDouble();
        int Credit_Score = sc.nextInt();
        boolean eligible = true;

        if(Age<=0){
            System.out.println("Invalid age: must be a positive integer.");
            eligible = false;
        }
        else if (Age<18) {
            System.out.println("Not eligible: age must be at least 18.");
            eligible = false;
        }
        else if (Age>80) {
            System.out.println("Not eligible: maximum eligible age is 80.");
            eligible = false;
        }
        else{
            System.out.println("valid Age");
        }

        if(Salary<=0){
            System.out.println("Invalid salary: must be a positive number.");
            eligible = false;
        }
        else if(Salary<=30000) {
            System.out.println("Not eligible: salary must be at least 30,000.");
            eligible = false;
        }
        else if(Salary>=30000) {
            System.out.println("Valid Salary");
        }

        if(Credit_Score<=0){
            System.out.println("Invalid credit score: must be a positive integer");
            eligible = false;
        } else if (Credit_Score<650) {
            System.out.println("Not eligible: credit score must be at least 650.");
            eligible = false;
        } else if (Credit_Score>850) {
            System.out.println("Not eligible: maximum valid credit score is 850");
            eligible = false;
        }
        else{
            System.out.println("Credit score is valid.");
        }
        if(eligible){
            System.out.println("Congratulations! You are eligible for the loan.");
        }
        else{
            System.out.println("Sorry, you are not eligible for the loan.");
        }
    }
}
