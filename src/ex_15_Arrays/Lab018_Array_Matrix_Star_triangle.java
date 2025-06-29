package ex_15_Arrays;

public class Lab018_Array_Matrix_Star_triangle {
    public static void main(String[] args) {
        //n=3
        //*
        //**
        //***

        int [][] n = new int[3][3];
        for(int i=0; i<n.length; i++){
            for(int j=0; j<=n[i].length; j++) {


                if (i == j) {
                    System.out.print("*");
                } else if (i < j) {
                    break;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
