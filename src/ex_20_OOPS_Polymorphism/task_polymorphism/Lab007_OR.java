package ex_20_OOPS_Polymorphism.task_polymorphism;
/* Task 2: Vehicle Start
Title: Demonstrate engine start behavior using overriding
Description:
Create a base class Vehicle with a method start().
Create Bike and Car classes that override the start() method:
Bike prints "Kick start the bike"
Car prints "Turn the key to start the car"
This shows how polymorphism works with method overriding.*/

public class Lab007_OR {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();

        Car c = new Car();
        c.start();

    }
}
class Vehicle{

    void start(){
    }
}

class Bike extends Vehicle {
    void start(){
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle {
    void start(){
        System.out.println("Turn the key to start the car");
    }
}