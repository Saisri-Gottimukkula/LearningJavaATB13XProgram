package ex_15_Arrays;

import java.util.Scanner;

public class Lab021_Array_Matrix_Star_triangle_LeftHand {
    public static void main(String[] args) {
        //n=3
        //***
        //**
        //*
        int n =3;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
