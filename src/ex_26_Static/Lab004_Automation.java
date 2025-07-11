package ex_26_Static;

public class Lab004_Automation {
    public static void main(String[] args) {
        Automation A = new Automation();
        System.out.println(Automation.driver);

        Automation T1 = new Automation();
        Automation T2 = new Automation();

        System.out.println(T1.driver);
        System.out.println(T2.driver);
    }
}

class Automation{
    static String driver = "chrome";
}



//if we want to share with everyone we can just make it static which is common to all