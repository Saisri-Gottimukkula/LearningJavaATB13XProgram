package ex_19_OOPS_Inheritance.Single_Inheritance;

public class Realcase_SI{
    public static void main(String[] args) {

        Testcase01 t1 = new Testcase01();
        t1.testcaseTC1();

        Testcase02 t2 = new Testcase02();
        t2.testcaseTC2();

        CommonToAll c1 = new Testcase01(); //Dynamic Dispatch: father reference can be present with the object of son

       // Testcase02 t1 = new CommonToAll();// this is not possible-> son reference with the object of father

    }
}
