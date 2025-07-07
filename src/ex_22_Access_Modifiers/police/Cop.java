package ex_22_Access_Modifiers.police;

public class Cop {

    public int gun;
    String idcard;

 public Cop(int bullet){

     this.gun = bullet;
 }

    public Cop() {

    }

    protected void canIshoot(){
     System.out.println("Yes! you can shoot");
 }

 void defaultAM(){
     System.out.println("Hi Cop");
 }

}
