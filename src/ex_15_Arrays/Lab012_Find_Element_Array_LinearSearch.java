package ex_15_Arrays;

public class Lab012_Find_Element_Array_LinearSearch {
    public static void main(String[] args) {
        int array[] = {56,78,34,67,89,66};

        //find the index of an element 67

        int target = 67;
        for(int i=0; i< array.length; i++){
            if(target == array[i]){
                System.out.println(i); //print the index of 67
            }
        }
    }
}
