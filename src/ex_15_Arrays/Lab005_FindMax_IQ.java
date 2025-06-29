package ex_15_Arrays;

import java.util.Arrays;

public class Lab005_FindMax_IQ {
    public static void main(String[] args) {
        int[] array = {23, 43, 11, 23, 78, 68, 54, 96, 76, 99};
        int output = output_max(array);
        System.out.println(output);
    }

        static int output_max(int[] array){
            int max = array[0]; //assuming first element is the maximum number
            for(int i=0; i<array.length; i++){
                if(array[i]>max){ //to find minimum value just change the > to <
                    max=array[i];
                }
            }


            return max;

        }

}
