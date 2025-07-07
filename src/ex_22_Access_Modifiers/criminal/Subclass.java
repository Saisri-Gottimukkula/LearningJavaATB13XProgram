package ex_22_Access_Modifiers.criminal;

import ex_22_Access_Modifiers.police.Cop;

public class Subclass extends Cop {

    public Subclass() {
        super();
    }

    public static void main(String[] args) {
        Subclass sc = new Subclass();
        sc.canIshoot();
    }
}
