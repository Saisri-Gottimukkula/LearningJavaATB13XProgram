package ex_20_OOPS_Polymorphism.method_OverLoading;

public class Lab001_Method_Overloading {
    public static void main(String[] args) {
    MathOperations m1 = new MathOperations();
    int r1 = m1.add(3,4);
    int r2 = m1.add(2,5,7);
    double r3 = m1.add(12,6.7);
    String r4 = m1.add("sai", "sree");


    }
}

class MathOperations{

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }
}

//this is called method overloading. it has same methods with different parameters and different return type
//during compile time only we will know which method we are going to use based on parameters