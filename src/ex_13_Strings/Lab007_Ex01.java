package ex_13_Strings;

public class Lab007_Ex01 {
    public static void main(String[] args) {
        String s1 = "saisri";
        String s2 = "saisri";
        String s3 = new String("saisri");

        System.out.println(s1==s2);//checks location
        System.out.println(s1==s3);//checks location
        System.out.println(s1.equals(s3));//checks value

    }
}
