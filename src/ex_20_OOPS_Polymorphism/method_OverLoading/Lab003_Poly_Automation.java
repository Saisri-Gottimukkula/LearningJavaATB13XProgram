package ex_20_OOPS_Polymorphism.method_OverLoading;

public class Lab003_Poly_Automation {
    public static void main(String[] args) {
        Automation a1 = new Automation();
        a1.startbrowser();
        a1.startbrowser("chrome");

    }
}

class Automation{

    void startbrowser(){
        System.out.println("starting the browser");
    }

    String startbrowser(String a){
        System.out.println("starting the chrome");
        return a;
    }
}
