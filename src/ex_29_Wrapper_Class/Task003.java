package ex_29_Wrapper_Class;
/*Task 3: Convert int to Integer using Autoboxing
Description:Declare an int, assign a value, and convert it to Integer using autoboxing.
Expected Output:
Primitive value: 10
Wrapper object: 10*/

public class Task003 {
    public static void main(String[] args) {
        int value = 10;
        Integer value1 = value;
        System.out.println("Primitive value: " + value);
        System.out.println("Wrapper object: " + value1);
    }
}
