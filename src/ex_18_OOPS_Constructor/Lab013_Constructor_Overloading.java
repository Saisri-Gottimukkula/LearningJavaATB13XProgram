package ex_18_OOPS_Constructor;

public class Lab013_Constructor_Overloading {
    public static void main(String[] args) {
        Person p1 = new Person("saisri", 933456543, "XYZ");
        System.out.println(p1.mobile_no);

        Person p2 = new Person();
        p2.name = "siri";
        System.out.println(p2.name);
    }
}

class Person1{

    String name;
    long mobile_no;
    String address;

    Person1(){ //default constructor

    }

    Person1(String name_user, long mobile_no_user, String address_user){ //parameterised constructor
        this.name = name_user;
        this.mobile_no = mobile_no_user;
        this.address = address_user;
    }

    Person1(String name_user, long mobile_no_user){ //parameterised constructor
        this.name = name_user;
        this.mobile_no = mobile_no_user;
    }

    Person1(String name_user){ //parameterised constructor
        this.name = name_user;
    }

}

//if we have more than one constructor that is called constructor overloading