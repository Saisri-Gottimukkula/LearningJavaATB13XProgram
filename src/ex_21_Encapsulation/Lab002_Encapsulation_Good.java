package ex_21_Encapsulation;

public class Lab002_Encapsulation_Good {
    public static void main(String[] args) {
        Orangelogin s1 = new Orangelogin("Admin","Pass123");
//        System.out.println(s1.username);//this we cant access becoz we made it as private
//        System.out.println(s1.password);//this we cant access becoz we made it as private
       // System.out.println(s1.password);
        System.out.println(s1.getPassword());
       s1.setPassword("admin123", true);
      String pass = s1.getPassword();
        System.out.println(pass);


    }
}

class Orangelogin {
    private String username;
    private String password;

    public Orangelogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        }
        else{
            System.out.println("No! you cant set password!");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}



//if we want to access the password but only for admin then we need to use getter setter methods