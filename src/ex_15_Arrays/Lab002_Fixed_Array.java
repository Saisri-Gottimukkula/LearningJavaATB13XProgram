package ex_15_Arrays;

public class Lab002_Fixed_Array {
    public static void main(String[] args) {

        int [] a = {1,2,3}; //pre defined array

        int [] marks = new int[5]; // fixed array, we are fixing the size
        String [] names = new String[3]; //size is 3 & index from 0 to 2
        names[0] = "saisri";
        names[1] = "teja";
        names[2] = "pushpa";
        System.out.println(names[2]);
    }
}
