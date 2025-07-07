package ex_22_Access_Modifiers.police;

public class Jrcop {
    public static void main(String[] args) {
        Cop jrcop = new Cop(100);
        jrcop.gun = 100;
        jrcop.canIshoot();
        jrcop.defaultAM();
    }

}
