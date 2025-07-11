package ex_29_Wrapper_Class;
/*Task 4: Convert Integer to int using Unboxing
Description:Create an Integer object and convert it back to primitive using unboxing.
Expected Output:
Integer object: 20
Unboxed primitive: 20*/

public class Task004 {
    public static void main(String[] args) {

        Integer num = 20;
        System.out.println("Integer onject: " + num);

        int num2 = num;
        System.out.println("Unboxed primitive: " + num2);
    }
}
