package ex_05_Switch;

public class Lab006_SwitchEx4 {
    public static void main(String[] args) {
        //If we are using JDK >13 then we can use arrow in switch. No need to use break here
        int value = 005 ;
        switch (value) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("default");
        }
    }
}
