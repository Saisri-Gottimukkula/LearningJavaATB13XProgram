package ex_15_Arrays;

import java.util.Scanner;

public class Lab019_Array_Matrix_Star_triangle {
    public static void main(String[] args) {
        //n=3
        //*
        //**
        //***

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
