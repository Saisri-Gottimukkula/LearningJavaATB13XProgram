package ex_19_OOPS_Inheritance.task_Inheritance;

public class Multilevel_Login_System {
    public static void main(String[] args) {
        SuperAdmin SA = new SuperAdmin();
        SA.login();
        SA.accessAdminPanel();
        SA.shutdownSystem();
    }
}

class User{
    void login(){
        System.out.println("login");
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("accessAdminPanel");
    }
}

class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("shutdownSystem");
    }
}