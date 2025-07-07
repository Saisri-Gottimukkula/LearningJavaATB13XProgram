package ex_20_OOPS_Polymorphism.task_polymorphism;
/*Task 3: Multiply Numbers
Title: Multiply using overloaded methods
Description:
Create a class MathOperations with two multiply() methods:
One takes two integers and returns the product
Another takes three integers and returns their product
This helps students understand how Java distinguishes methods based on parameter count.*/

public class Task003_OL {
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();
        System.out.println(mo.multiply(3,6));
        System.out.println(mo.multiply(3,5,7));

    }
}

class MathOperations{

    int multiply(int a, int b){
        return a*b;
    }

    int multiply(int a, int b, int c){
        return a*b*c;
    }
}