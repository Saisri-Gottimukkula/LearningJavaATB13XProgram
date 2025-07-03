package ex_15_Arrays;

public class Lab016_Array_Matrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i< matrix.length; i++){ //matrix.length will print rows

                for(int j=0; j<matrix[i].length; j++){//columns
                    // matrix[i].length gives the number of columns in the current row i — also 3 in this case.
                    System.out.print(matrix[i][j] + "|");
                   // System.out.println(matrix[i][j]);//ln will add new line after every print
            }
            System.out.println();//after every row we aere adding new line
        }
    }
}
