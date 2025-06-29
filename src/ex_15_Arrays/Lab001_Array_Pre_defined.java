package ex_15_Arrays;

public class Lab001_Array_Pre_defined {
    public static void main(String[] args) {
        int a = 10;
        int [] marks = {91,98,97,45,79,99,100}; //pre defined array
        System.out.println(marks.length);
        System.out.println(marks[1]);
        System.out.println(marks[5]);
        System.out.println(marks[10]);

        boolean [] output = {true, false, true}; //we can create boolean array also

        char ch = 'A';
        String s1 = "Array"; //string is also a array of characters
    }
}
