package ex_20_OOPS_Polymorphism.task_polymorphism;
/*Task 1: Add Two Numbers
Title: Overload a method to add different types of numbers
Description:
Create a class Calculator with two overloaded methods add(int a, int b) and add(double a, double b).
The int version should add two integers.
The double version should add two decimal numbers.
In the main method, call both versions to demonstrate how overloading works with data types.*/

public class Task001_OL {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(3,5));
        System.out.println(c1.add(3.4,6.8));

    }
}

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}