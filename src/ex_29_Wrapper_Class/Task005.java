package ex_29_Wrapper_Class;
/*Task 5: Compare Wrapper objects using == and equals()
Description:Compare two Integer objects using == and .equals() and print the results.
Expected Output:
a == b: true
c == d: false
a.equals(b): true
c.equals(d): true*/

public class Task005 {
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b: " + (a==b));
        System.out.println("c == d: " + (c==d));
        System.out.println("a.equals(b): " + a.equals(b));

        System.out.println("c.equals(d): " + c.equals(d));
    }
}


/* == checks if both references point to the same object.
equals() checks if the values inside the objects are equal.
Java caches Integer objects from -128 to 127, so a == b returns true, but not for larger values like 200*/