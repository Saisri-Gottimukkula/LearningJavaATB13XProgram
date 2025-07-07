package ex_21_Encapsulation;

public class Lab003_Real_Bank {
    public static void main(String[] args) {
        ICICI bank = new ICICI("saisri",100);
//        System.out.println(bank.name);
//        System.out.println(bank.balance);
        System.out.println(bank.getName());
        System.out.println(bank.getBalance());
        bank.setBalance(500,true);
        long pass = bank.getBalance();
        System.out.println(pass);

        bank.setName("teja", false);
        String truename = bank.getName();
        System.out.println(truename);


    }
}

class ICICI {
    private String name;
    private long balance;

    public ICICI(String name, long balance){
        this.name = "name";
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin1) {
        if(isAdmin1){
            this.name = name;
        }
        else{
            System.out.println("You cannot set the name");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isAdmin) {
        if(isAdmin){
            this.balance = balance;
        }
        else{
            System.out.println("You cannot set the balance");
        }

    }


}
