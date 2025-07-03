package ex_18_OOPS_Constructor;

public class Lab011 {
    public static void main(String[] args) {
        Baby1 b1 = new Baby1();
        Baby1 b2 = new Baby1();
        System.out.println(b1.name);
        System.out.println(b2.name); //whenever we call this default values will be printed

        Baby1 b3 = new Baby1("babu", 8009, 1990,12,06);
        Baby1 b4 = new Baby1("ira", 8754, 1995,02,03);
        System.out.println(b3.name);
        System.out.println(b4.name);
    }
}


class Baby1{

    String name;
    int aadhar_number;
    int year;
    int month;
    int date;

    Baby1(){    //default constructor

        name = "pandu";
        aadhar_number = 9090;
        year = 2025;
        month = 07;
        date = 02;

    }

    Baby1(String name_user, int aadhar_number_user, int year_user, int month_user, int date_user){
        this.name = name_user;
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.date = date_user;
    }

}