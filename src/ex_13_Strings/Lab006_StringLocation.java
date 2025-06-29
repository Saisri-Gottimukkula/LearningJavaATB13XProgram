package ex_13_Strings;

public class Lab006_StringLocation {
    public static void main(String[] args) {
        String name = "saisri";
        String name1 = "saisri";
        String name2 = "saisri";
        //even if we create n no. of string with same value, in string constant pool only one will be avilable and that will be reused

        String name3 = new String("saisri");
        String name4 = new String("saisri");
        String name5 = new String("SAISRI");
        //here in this case everytime you create new object, memory will be allocated in the object area


        //== -> comparision string -> this check the loaction reference
        System.out.println(name1 == name4);

        System.out.println(name3 == name4); // though they create in object area but occupies different memory allocation

        // = -> this checks the contents(value )in the string
        System.out.println(name3.equals(name4));
        System.out.println(name4.equals(name5));
        System.out.println(name4.equalsIgnoreCase(name5)); //ignoring cases
    }
}


//as both are different location even though value is same it will return false