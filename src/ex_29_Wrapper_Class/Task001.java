package ex_29_Wrapper_Class;
/*Task 1: Autoboxing and Unboxing
Description: Demonstrate automatic conversion from int to Integer (Autoboxing) and back from Integer to int (Unboxing).
Expected Output:
Primitive: 50
Wrapper: 50
Unboxed again: 50*/

public class Task001 {
    public static void main(String[] args) {
        int Primitive = 50;
        System.out.println("Primitive: "  + Primitive);

        Integer Wrapper = Primitive;
        System.out.println("Wrapper: " + Wrapper);

        int Unboxed_again = Wrapper;
        System.out.println("Unboxed_again: " + Unboxed_again);
    }
}
