package ex_19_OOPS_Inheritance.task_Inheritance;

public class Vehicle_Constructor_Chain {
    public static void main(String[] args) {
        Bike b1 = new Bike();
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready");
    }
}

//When new Bike() is executed, the Bike constructor runs.
//But before the Bike constructor body executes, the Vehicle constructor runs automatically because Bike extends Vehicle
//This shows the constructor call order: base class constructor first, then derived class constructor.