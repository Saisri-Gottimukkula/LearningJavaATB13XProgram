package ex_15_Arrays;

public class Lab014_array2D {
    public static void main(String[] args) {
        //2 Dimensional array

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; //2 dimensional array is created like  this
        //OR we can create this way also


        int[][] array1;
        array1 = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6}

        };


        int[][] array_2d = new int[3][3];//this creates empty table with size 3x3 stores default value 0
        //now we are assigning values in the table

        array_2d[0][0] = 1;
        array_2d[0][2] = 3;
        array_2d[0][3] = 5;
        //array_2d[0][4] =8; this will give exception as it we are exceeding the matrix

        array_2d[2][0] = 2;
        array_2d[2][2] = 4;
        array_2d[2][3] = 6;

        array_2d[3][0] = 7;
        array_2d[3][2] = 8;
        array_2d[3][3] = 9;

    }
}
