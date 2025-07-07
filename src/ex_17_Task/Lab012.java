package ex_17_Task;

import java.util.Scanner;

/*Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions) Research from your side for this program.
Basic Pay = ₹30,000
HRA = 20% of 30,000 = ₹6,000
DA = 10% of 30,000 = ₹3,000
Gross Salary = 30,000 + 6,000 + 3,000 = ₹39,000
Tax Deduction = 10% of 39,000 = ₹3,900
Net Salary = 39,000 - 3,900 = ₹35,100*/
public class Lab012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay");
        double basic_pay = sc.nextDouble();
        double HRA;
        double DA;
        double net_salary;
        double Tax;
        double Gross_Salary;

        System.out.println("----------------------");

        HRA = (basic_pay*20)/100;
        DA =  (basic_pay*10)/100;
        Gross_Salary = basic_pay + HRA+DA;
        Tax = (Gross_Salary*10)/100;
        net_salary = Gross_Salary-Tax;

        System.out.println("House Rent Allowance: " + HRA);
        System.out.println("Dearness Allowance: " + DA);
        System.out.println("Gross Salary: " + Gross_Salary);
        System.out.println("Tax Deductions: " + Tax);
        System.out.println("Net Salary: " + net_salary);
    }
}
