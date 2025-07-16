package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab013 {
    public static void main(String[] args) {
        Student s1 = new Student("saisri","1");
        Student s2 = new Student("Tejasree","2");
        Student s3 = new Student("sree","3");

        List<String> MyStudents = new ArrayList();
        MyStudents.add(String.valueOf(s1));
        MyStudents.add(String.valueOf(s2));
        MyStudents.add(String.valueOf(s3));
        System.out.println(MyStudents);

    //s1,s2,s3 these are object reference and details are not visible

        System.out.println(MyStudents);
        s1.printdetails();
        s2.printdetails();
        s3.printdetails();

    }
}

class Student{
    private String name;
    private String rollnumber;

    public Student(String name, String rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printdetails(){
        System.out.println("name: " + this.name);
        System.out.println("Roll.no: " + this.rollnumber);

    }
    @Override
    public String toString() {
        return "Student{" + "name= " +name +"," +  "rollno.= " + rollnumber +"}";
    }
}