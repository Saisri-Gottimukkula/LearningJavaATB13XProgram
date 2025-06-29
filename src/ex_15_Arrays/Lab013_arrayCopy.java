package ex_15_Arrays;

import java.util.Arrays;

public class Lab013_arrayCopy {
    public static void main(String[] args) {
        int originalarray[] = {34,67,55,4,2,44};
        int copyarry[] = new int[originalarray.length];

        System.arraycopy(originalarray,0,copyarry,0,originalarray.length);
        System.out.println("Copied array: " + Arrays.toString(copyarry));

        System.out.println("------------------------------");

        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.println("Copied array: " + Arrays.toString(copy));



    }
}
