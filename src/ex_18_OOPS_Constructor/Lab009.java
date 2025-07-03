package ex_18_OOPS_Constructor;

public class Lab009 {
    public static void main(String[] args) {
        Web_Automation w1 = new Web_Automation();

    }
}

class Web_Automation{

    Web_Automation(){
        System.out.println("I want to read a CSV file");
        System.out.println("open the page before loading the scripts");
        System.out.println("you can do anything before object is created");
    }
}