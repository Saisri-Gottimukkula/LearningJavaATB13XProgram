package ex_05_Switch;

public class Lab007_switchEx5 {
    public static void main(String[] args) {
        int num = 11 ;
        switch (-1)
        {
            case -1:
                System.out.println("All are related to A group");
                break;
            case 9 :
                System.out.println("All are related to B group");
                break;
            default :
                System.out.println("not related");
        }
    }
}
