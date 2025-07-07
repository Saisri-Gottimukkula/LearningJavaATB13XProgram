package ex_20_OOPS_Polymorphism.task_polymorphism;
/*Task 4: Login Functionality
Title: Different login behaviors for users
Description:
Create a class User with method login() that prints “User login”.
Create subclasses AdminUser and RegularUser, each overriding login() with their own logic/messages.
Demonstrate calling the login() method using base class reference to highlight runtime polymorphism*/

public class Lab009_OR {
    public static void main(String[] args) {
        User u = new User();
        u.login();

    }
}
class User{
    void login(){
        System.out.println("User Login");
    }
}
class AdminUser extends User{
    void login(){
        System.out.println("Admin user login");
    }
}
class RegularUser extends User{
    void login(){
        System.out.println("Regular user login");
    }
}