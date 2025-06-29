package ex_13_Strings;

public class Lab005_String_memoryManagement {
    public static void main(String[] args) {
        String name = "saisri";
        String name1 = "saisri";
        String name2 = "saisri";
        //even if we create n no. of string with same value, in string constant pool only one will be avilable and that will be reused

        String name3 = new String("saisri");
        String name4 = new String("saisri");
        //here in this case everytime you create new object, memory will be allocated in the object area
    }
}

// total string constant pool and object area
//             1              and    3
