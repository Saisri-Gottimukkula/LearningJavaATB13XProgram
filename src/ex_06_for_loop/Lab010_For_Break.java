package ex_06_for_loop;

public class Lab010_For_Break {
    public static void main(String[] args) {
        //for loop can have break but not if loop
        for(int i=0;i<50;i++)
        {
            if(i==5){
                break;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
