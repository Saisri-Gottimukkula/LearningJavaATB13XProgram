package ex_15_Arrays;

import java.util.Arrays;

public class Lab006_FindMax_Min_UsingMethods {
    public static void main(String[] args) {
        int [] array = {23,43,11,23,78,68,54,96,76,99};
        Arrays.sort(array);
        System.out.println(array[9]);

        //OR (we can use any way)

        System.out.println(array[array.length-1]);
    }
}
