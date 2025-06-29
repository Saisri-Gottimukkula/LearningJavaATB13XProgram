package ex_13_Strings;

public class Lab001_Strings_Immutable {
    public static void main(String[] args) {
        String name = "saisri"; //this will create in string constant pool area
        //name.toUpperCase();
        name = name.toUpperCase(); // if you want to see the name in upper case you need to assign it again
        System.out.println(name);
    }
}
//immutable -> that cannot be changed