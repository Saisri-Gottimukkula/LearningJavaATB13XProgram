package ex_21_Encapsulation;

public class Lab001_Encapsulation_Bad {
    public static void main(String[] args) {
        Sitelogin s1 = new Sitelogin("Admin","Pass123");
        System.out.println(s1.username);
        System.out.println(s1.password);
        s1.password = "12345";
        System.out.println(s1.password);
    }
}

class Sitelogin {
    public String username;
    public String password;

    public Sitelogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

}

//this is bad idea because anyone can see the password. so in this case encapsulation comes to picture
//we need to make it as public to private so no one can access it