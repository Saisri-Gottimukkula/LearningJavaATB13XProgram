package ex_12_Functions;

import java.util.Scanner;

public class Lab008_Arthimetic_EdgeCases {
    public static void main(String[] args) {
        //create a function, sub, add, mul, div
        //with parameter a and b (take parameter from the user)
        //with return and arguments
        //check edge cases (what if user enters a string)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = 0;
        if(scan.hasNextInt()){
            a = scan.nextInt();
        }
        else{
            System.out.println("Enter a integer");
            //return;
            System.exit(0);
        }

        System.out.println("Enter number 2");
        int b = 0;
        if(scan.hasNextInt()){
            b = scan.nextInt();
        }
        else {
            System.out.println("Enter a integer");
            return;
        }

        int result_sum = sum_0f_two_numbers(a,b);
        System.out.println(result_sum);

        int result_sub = sub_0f_two_numbers(a,b);
        System.out.println(result_sub);

        int result_mul = Mul_0f_two_numbers(a,b);
        System.out.println(result_mul);

        int result_div = div_0f_two_numbers(a,b);
        System.out.println(result_div);

        int result_mod = mod_0f_two_numbers(a,b);
        System.out.println(result_mod);


    }

    static int sum_0f_two_numbers(int a,int b){
        return a+b;
    }
    static int sub_0f_two_numbers(int a,int b){
        return a-b;
    }
    static int Mul_0f_two_numbers(int a,int b){
        return a*b;
    }
    static int div_0f_two_numbers(int a,int b){
        if(b==0){
            throw new ArithmeticException("B cant be zero!"); //here you can use sout and print b cant be zero also
        }
        return a/b;
    }
    static int mod_0f_two_numbers(int a,int b){
        return a%b;
    }

}