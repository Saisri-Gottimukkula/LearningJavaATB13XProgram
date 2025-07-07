package ex_20_OOPS_Polymorphism.method_OverRiding;

public class Lab005_Web_Auto {
    public static void main(String[] args) {
        firefox f1 = new firefox();
        f1.startbrowser();

        chrome c1 = new chrome();
        c1.startbrowser();

        CommonToAll c2 = new CommonToAll();
        c2.startbrowser();
        System.out.println("-------------------");

        //dynamic dispatch

        CommonToAll c3 = new chrome();
        c3.startbrowser();

        CommonToAll c4 = new firefox();
        c4.startbrowser();

    }
}

class CommonToAll{

    void startbrowser(){
        System.out.println("start the IE browser");
    }
}

class chrome extends CommonToAll{

    void startbrowser(){
        System.out.println("start the chrome browser");
    }
}

class firefox extends CommonToAll{
    void startbrowser(){
        System.out.println("start the firefox browser");
    }
}