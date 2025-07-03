package ex_18_OOPS_Constructor;

public class Lab002 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2; //here s2 is just a object reference so this will not called
        new Student(); //this is object creation without name so this will be called
    }
}

class Student{
    String name;

    Student(){
        System.out.println("Default Constructor"); //if constructor is same as class name then it is called default constructor
    }

    void studying(){
        System.out.println("studying");
    }

}
