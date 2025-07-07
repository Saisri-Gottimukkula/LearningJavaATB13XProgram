package ex_20_OOPS_Polymorphism.task_polymorphism;
/*Task 2: Print Data
Title: Create a universal printer with overloading
Description:
Create a class Printer with multiple printData() methods to handle different data types:
printData(String data)
printData(int data)
printData(float data)
Demonstrate in the main() method how the same method name behaves differently depending on the parameter type.*/

public class Task002_OL {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        System.out.println(p1.printData("saisri"));
        System.out.println(p1.printData(10));
        System.out.println(p1.printData(3.0f));
    }
}

class Printer{

    String printData(String data){
        return data;
    }

    int printData(int data){
        return data;
    }

    float printData(float data){
        return data;
    }
}