package ex_05_Switch;

public class Lab005_Switch_MultipleMatch {
    public static void main(String[] args) {
        int num = 007 ;
        switch (num)
        {
            case 001,002,003:
                    System.out.println("All are related to A group");
                    System.out.println("All are Electronic gadgets");
            break;
            case 004,005,006:
                System.out.println("All are related to B group");
                System.out.println("All are mech gadget");
                break;

            default :
                System.out.println("not related");
        }
    }
}
