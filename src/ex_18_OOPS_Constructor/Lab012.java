package ex_18_OOPS_Constructor;

public class Lab012 {
    public static void main(String[] args) {
        Person p1 = new Person("sravan", 933456543, "XYZ");
        System.out.println(p1.mobile_no);

        Person p2 = new Person();
        p2.name = "siri";
        System.out.println(p2.name);
    }
}

class Person{

    String name;
    long mobile_no;
    String address;

    Person(){ //default constructor

    }

    Person(String name_user, long mobile_no_user, String address_user){ //parameterised constructor
        this.name = name_user;
        this.mobile_no = mobile_no_user;
        this.address = address_user;
    }

}