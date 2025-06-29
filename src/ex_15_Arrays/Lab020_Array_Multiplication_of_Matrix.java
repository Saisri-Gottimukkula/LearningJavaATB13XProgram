package ex_15_Arrays;

import java.util.Scanner;

public class Lab020_Array_Multiplication_of_Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                System.out.print(i*j + " |");
            }
            System.out.println();
        }
    }
}
