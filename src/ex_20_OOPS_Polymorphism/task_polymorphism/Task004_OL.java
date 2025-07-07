package ex_20_OOPS_Polymorphism.task_polymorphism;
/*Task 4: Greet User
Title: Greet users differently using overloading
Description:
Create a class Greeter with the following methods:
greet() – prints "Hello!"
greet(String name) – prints "Hello, [name]!"
This task teaches overloading based on the number of parameters.*/

public class Task004_OL {
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        g1.greet();
        g1.greet("saisri!");

    }
}

class Greeter{

    void greet(){
        System.out.println("Hello!");
    }

    String greet(String name){
        System.out.println("Hello," + name);
        return name;
    }
}