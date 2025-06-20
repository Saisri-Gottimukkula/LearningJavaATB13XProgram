package ex_05_Switch;

public class Lab008_SwitchEx6 {
    public static void main(String[] args) {
        char code = 'c';
        switch (code) {
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
            default:
                System.out.println("Hellooooo");
                break;
        }
    }
}