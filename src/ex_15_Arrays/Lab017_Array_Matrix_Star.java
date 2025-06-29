package ex_15_Arrays;

public class Lab017_Array_Matrix_Star {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i< matrix.length; i++){ //matrix.length will print rows

                for(int j=0; j<matrix[i].length; j++){//columns
                    System.out.print("*");

            }
            System.out.println();
        }
    }
}
