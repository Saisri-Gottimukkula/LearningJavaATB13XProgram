package ex_15_Arrays;

import java.util.Arrays;

public class Lab004_Array {
    public static void main(String[] args) {

        int [] marks = {90,98,32,56,74,87}; //one dimensional array
        System.out.println(marks.length);

        //if we want to print all values we should use for loop
        //here we cant print using sout

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("------------");


        Arrays.sort(marks);

        //sorting array -> accending to decending
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println(marks); //reference address will print
    }
}