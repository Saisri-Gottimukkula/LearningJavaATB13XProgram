package ex_20_OOPS_Polymorphism.method_OverLoading;

public class Lab002_Method_Overloading_EX {
    public static void main(String[] args) {
    Home h1 = new Home();
    h1.task();
    h1.task(3);
    h1.task(false);


    }
}

class Home {

    void task(){
        System.out.println("task 1");
    }

    int task(int a){
        System.out.println("task 2");
        return a;
    }

    boolean task(boolean a){
        return a;
    }
}

