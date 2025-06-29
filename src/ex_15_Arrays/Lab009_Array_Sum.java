package ex_15_Arrays;

public class Lab009_Array_Sum {
    public static void main(String[] args) {
        int sum = 0;
        int array[] = {12,34,10}; //sum = 56
        for(int i=0; i< array.length; i++) {
            sum = sum + array[i];
        }
         System.out.println(sum);


    }
}
