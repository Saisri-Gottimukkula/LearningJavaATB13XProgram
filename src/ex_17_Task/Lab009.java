package ex_17_Task;
/*Electricity Bill Calculation (Based on Units Consumed)
take the input from the user of Units.
Implement Rate Structure:
Define the rate structure for calculating the bill based on the number of units consumed.
First 100 units: 0.50Rs per unit
Next 100 units (101-200): 0.75Rs per unit
Next 100 units (201-300): 1.20Rs per unit
Above 300 units: 1.50Rs per unit*/

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units consumed");
        double unit = sc.nextDouble();

      if(unit<0){
        System.out.println("Invalid! Units cannot be zero");
      }
      
      double bill = 0.0;
      
      if(unit<=100){
          bill = unit*0.50;
          System.out.println("Electricity Bill:" + bill);
      }

      else if(unit<=200){
          bill = (100*0.50) + ((unit-100)*0.75);
          System.out.println("Electricity Bill:" + bill);
      }

      else if(unit<300){
          bill = ((100*0.50) + (100*0.75) + ((unit-200) * 1.20));
           System.out.println("Electricity Bill:" + bill);
      }

      else if(unit>300){
          bill = ((100*0.50) + (100*0.75) + (100 * 1.20) + (unit-300) * 1.50);
          System.out.println("Electricity Bill:" + bill);

      }
    }
}
