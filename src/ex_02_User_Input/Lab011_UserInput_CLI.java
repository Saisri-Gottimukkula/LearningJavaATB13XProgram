package ex_02_User_Input;

public class Lab011_UserInput_CLI {
    public static void main(String[] args) {
        String string_age = args[0];
        int age = Integer.parseInt(string_age);
        String canIVote = age>=18 ? "Yes" : "No";
        System.out.println(canIVote);
    }
}
