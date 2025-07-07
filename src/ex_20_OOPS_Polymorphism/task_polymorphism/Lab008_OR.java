package ex_20_OOPS_Polymorphism.task_polymorphism;
/*Task 3: Employee Role Info
Title: Show employee roles with overridden methods
Description:
Create a class Employee with method role() printing “General Employee”.
Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
Call role() on each object to show how overriding helps in specialization.*/

public class Lab008_OR {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.role();
        Manager m = new Manager();
        m.role();
        Clerk c = new Clerk();
        c.role();
        Tester t = new Tester();
        t.role();

    }
}

class Employee{
    void role(){
        System.out.println("General Employee");
    }
}

class Manager extends Employee{
    void role(){
        System.out.println("Manager");
    }
}

class Clerk extends Employee{
    void role(){
        System.out.println("Clerk");
    }
}

class Tester extends Employee{
    void role(){
        System.out.println("Tester");
    }
}