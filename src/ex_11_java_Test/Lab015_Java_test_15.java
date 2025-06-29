package ex_11_java_Test;

import java.util.Scanner;

public class Lab015_Java_test_15 {
    public static void main(String[] args) {
//print prime numbers from 1 to 100

        for(int i=2; i<=100; i++){
            int flag =0;
            for(int j=2; j<i; j++){

                if(i%j==0){
                    flag=1;
                    break;
                }

            }

            if(flag==0){
                System.out.print(i + " ");
            }




        }
    }
}
