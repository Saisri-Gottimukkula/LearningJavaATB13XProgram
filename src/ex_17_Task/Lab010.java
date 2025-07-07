package ex_17_Task;
/* Calculate Bonus Based on Salary and Years of Experience.
take the salary and Year info from the User.
Implement Bonus Calculation Logic:
Define the bonus structure based on salary and years of experience.
If years of experience is less than 1 year: No bonus.
If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
If years of experience is greater than 6 years: Bonus is 15% of the salary.*/

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter salary and year");
        int salary = sc.nextInt();
        int year = sc.nextInt();
        double bonus = 0.0;

        if(year<1){
            System.out.println("Sorry! No Bonus");
        }
        else if(year>=1 && year<=3){
            System.out.println("Congratulations! Bonus is 5% of the salary");
            bonus = (5*salary)/100;
            System.out.println("Bonus is: " + bonus);

        }
        else if(year>=4 && year<=6){
            System.out.println("Congratulations! Bonus is 10% of the salary");
            bonus = (10*salary)/100;
            System.out.println("Bonus is: " + bonus);
        }
        else if(year>6){
            System.out.println("Congratulations! Bonus is 15% of the salary");
            bonus = (15*salary)/100;
            System.out.println("Bonus is: " + bonus);
        }
    }
}
