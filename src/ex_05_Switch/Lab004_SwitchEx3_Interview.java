package ex_05_Switch;

public class Lab004_SwitchEx3_Interview {
    public static void main(String[] args) {
        char ch = 'A'; //character is also a interger thats why it is allowed in switch
        switch (65)
        {
            case 65 :
                System.out.println("ASCII Value");
                break;
            default :
            System.out.println("Not a valid");
        }
    }
}
