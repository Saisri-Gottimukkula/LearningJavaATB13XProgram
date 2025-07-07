package ex_22_Access_Modifiers;

public class Lab001_AM {
    public static void main(String[] args) {

    }
}

class Father{
    private int gold = 10;
    int car = 1;
    public int bhk2 = 1;
}

class Son extends Father{
    void Wecanuse(){
        //System.out.println(gold);//this we cant access becoz it is private
        System.out.println(car);
        System.out.println(bhk2);
    }

}
