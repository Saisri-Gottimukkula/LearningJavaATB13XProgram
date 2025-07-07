package ex_17_Task;
/*Find if a Person Can Travel Based on Visa Status and Age.
take the input from the user for
Age (integer), Visa Status (String or boolean).
Check Eligibility:
If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.
Validation Criteria
Age: - Must be a non-negative integer.
Should be greater than or equal to 18 to be eligible to travel.
Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
You can also use a boolean where true indicates a valid visa and false indicates an invalid visa*/

import java.util.Scanner;

public class Lab011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter visa status(True/False)");
        String visaStatus = sc.nextLine();
        boolean status = Boolean.parseBoolean(visaStatus.toLowerCase()); //to convert the string to true or false

        if(age<=0) {
            System.out.println("Invalid age! Enter valid age");
            return;
        }
        if(age>=18 && status){
            System.out.println("Person can Travel");
        }
        else{
            System.out.println("Person cannot Travel");
        }
    }
}
