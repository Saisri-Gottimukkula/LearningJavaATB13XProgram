package ex_18_OOPS_Constructor;

public class Lab010 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.name = "Tesla"; //if we write this the name will be updated
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model); //whenever i called here the default values will be displayed. no need to write again
        System.out.println(c2.name);
    }
}


class Car{
    String name;
    String model;
    int year;

    Car(){

        name = "unknown car";
        model = "XXX";
        year = 2025;
    }
}