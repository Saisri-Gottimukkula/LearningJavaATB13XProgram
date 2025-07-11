package ex_29_Wrapper_Class;

public class Lab005 {
}

interface SIMCARD{

    void entercard();
}

class Oldphone implements SIMCARD{ //abstraction

    void calling(){
        System.out.println("dial pad");

    }

    @Override
    public void entercard() { //method override
        System.out.println("card entered");
    }
}

class Mobile extends Oldphone{ //single inheritance
    private Integer phone; //encapsulation with getter setter

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private Double price;
    static String mobile_carrier = "airtel";

    void Mobile(){ //default constructor
        System.out.println("Default Constructor");
    }

    public Mobile(Integer phone, String name, Double price){//parameterised constructor
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println(this.name + this.phone + this.price);
    }

    static void switchonAirplaneMode(){ //static function
        System.out.println("common airplane mode");
    }

    void pricechange(Integer price){ //method overloading
        System.out.println("change price in Integers");
    }
    void pricechange(Double price){ //method overloading
        System.out.println("change price in decimals");
    }
}