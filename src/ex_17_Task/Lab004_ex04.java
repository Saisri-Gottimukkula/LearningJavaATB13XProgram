package ex_17_Task;

public class Lab004_ex04 {

   // Write a Java Program to Transpose a Matrix

    public static void main(String[] args) {

        int array [][] = {{1,2,3}
                         ,{4,5,6},
                         {7,8,9}};

        System.out.println("orginal matrix");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println("Transpose of a matrix");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++) {
                System.out.print(array[j][i] + "|");
            }
            System.out.println();
        }



    }
}
