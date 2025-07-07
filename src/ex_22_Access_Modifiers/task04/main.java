package ex_22_Access_Modifiers.task04;

public class main {
    public static void main(String[] args) {
    Student s = new Student();
    s.showDetails();

    }
}

class Student{
    void showDetails(){
        System.out.println("Show Details");
    }
}