package ex_20_OOPS_Polymorphism.task_polymorphism;
/* Task 5: Find Maximum
Title: Find max using overloaded functions
Description:
Create a class Utility with two methods named max():
max(int a, int b) returns the larger of two integers
max(int a, int b, int c) returns the larger of three integers
max(double a, double b) returns the larger of two decimal values
Add method calls in main() to compare different types.*/

public class Task005_OL {
    public static void main(String[] args) {
        Utility u1 = new Utility();
        System.out.println(u1.max(5,6));
        System.out.println(u1.max(5,7,3));
        System.out.println(u1.max(12.4,31.5));
    }
}

class Utility{

    int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c && b>a){
            return b;
        }
        else{
            return c;
        }
    }

    double max(double a, double b){
        if(a>b){
            return a;
        }

        else{
            return b;
        }
    }
}
