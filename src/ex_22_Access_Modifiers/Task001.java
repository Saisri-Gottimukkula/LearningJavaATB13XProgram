package ex_22_Access_Modifiers;

//Create a Program to Access the private access modifier

public class Task001 {
    public static void main(String[] args) {
        BankLocker bl = new BankLocker(1000,10, "house bond");
        System.out.println("original cash:" + bl.getCash());
        System.out.println("original gold:" + bl.getGold());
        System.out.println("original documents:" + bl.getDocuments());
        bl.setCash(5000, true);
        System.out.println("changed cash: " + bl.getCash());

        bl.setGold(20,false);
        System.out.println("true gold: " + bl.getGold());

    }
}

class BankLocker{
    private int cash;
    private int gold;
    final String documents;

   public BankLocker(int cash1, int gold1, String documents1){
        this.cash = cash1;
        this.gold = gold1;
        this.documents = documents1;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash, boolean admin) {
       if(admin){
           this.cash = cash;
       }
       else{
           System.out.println("You cannot set this cash");
       }

    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold, boolean admin) {
       if(admin){
           this.gold = gold;
       }
       else{
           System.out.println("you cannot change the gold ");
       }

    }

    public String getDocuments() {
        return documents;
    }


}

