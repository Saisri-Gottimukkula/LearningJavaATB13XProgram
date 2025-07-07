package ex_24_Abstraction_Abstract.Abstract_Interface_Task;
/*Interface with Default and Static Method
Objective: Learn how to use default and static methods in interfaces (since Java 8).
Steps:
Create an interface Vehicle.
Add a default method start() that prints "Vehicle started".
Add a static method fuelType() that prints "Fuel type is Petrol".
Create a class Car that implements Vehicle.
In main(), create a Car object and call start().
Call Vehicle.fuelType() without creating an object.
Expected Output:
Vehicle started
Fuel type is Petrol*/

public class Task006 {
    public static void main(String[] args) {
        Car cr = new Car();
        cr.start();
        cr.fuelType();
    }
}

interface Vehicle{
    default void start(){
        System.out.println("Vehicle started");
    }

    default void fuelType(){
        System.out.println("Fuel type is Petrol");
    }
}

class Car implements Vehicle{

}