package ex_11_java_Test;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab012_Java_Test_12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        BigInteger factorial = BigInteger.ONE;
        //BigInteger.ONE -> A constant in the BigInteger class that represents the value 1 (just like int a = 1; but in BigInteger form).


        if(num==0){
            System.out.println(factorial);
        }
        else {
            for(int i = 1; i<=num; i++){
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(factorial);
        }


    }
}
