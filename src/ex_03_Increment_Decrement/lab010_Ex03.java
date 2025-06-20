package ex_03_Increment_Decrement;

public class lab010_Ex03 {
    public static void main(String[] args) {
//Program 1:

        int a = 5;

        int b = a++;

        System.out.println("a: " + a + ", b: " + b);

//Program 2:
        int i = 1;

        i = i++ + ++i;

        System.out.println(i); // ?


//Program 3:

        int x = 5;

        System.out.println(x++ + ++x); // ?





// Program 4:

        int c = 5;

        System.out.println(++c); // Output: ?

        System.out.println(c++); // Output: ?

        System.out.println(c);   // Output: ?

// Program 5:  Interview Question

        int d = 5;

        int e = d++ + ++d;

        System.out.println("d: " + d); // Output: ?

        System.out.println("e: " + e); // Output: ?



// Program 6:  Interview Question

        int f = 5;

        int g = f++ + ++f + f++ + ++f;

        System.out.println("f = " + f + ", g = " + g);
    }
}
