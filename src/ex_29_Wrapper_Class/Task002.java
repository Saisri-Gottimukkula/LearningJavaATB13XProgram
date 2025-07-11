package ex_29_Wrapper_Class;
/*Task 2: Converting String to Primitive Using Wrapper
Description:Use Integer.parseInt() to convert a string (e.g. "123") into a primitive int and print it.
Expected Output: Parsed number: 123*/

public class Task002 {
    public static void main(String[] args) {
        String name = "123";

        Integer Parsed_num = Integer.parseInt(name);
        System.out.println("Parsed number: " + Parsed_num);

    }
}
