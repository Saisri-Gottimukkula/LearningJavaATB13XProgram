package ex_13_Strings;

public class Lab008_StringFunctions {
    public static void main(String[] args) {
        String name = "saisri";

        System.out.println(name.length());
        System.out.println(name.charAt(4)); // gives the character at that particular index
        System.out.println(name.charAt(5));
        System.out.println(name.concat("Gottimukkula"));
        System.out.println(name.contains("in"));
        System.out.println(name.equals("Gottimukkula"));
        System.out.println(name.equalsIgnoreCase("saisri"));
        System.out.println(name.indexOf('a'));//gives index of a character
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith("e"));
        System.out.println(name.endsWith("i"));

        System.out.println(name.indexOf('s'));//gives first index
        System.out.println(name.lastIndexOf('s'));//gives last index

        System.out.println(name.replace('s','S'));

        //split
        String mail = "saisri@gamil@.com123";
        String [] mail1 = mail.split("@");
        System.out.println(mail1[0]);//saisri
        System.out.println(mail1[1]);//gmail
        System.out.println(mail1[2]);//.com123

        //substring
        //substring(given index, give index-1)
        String palindorme = "niagara. o Roar again";
        System.out.println(palindorme.length());
        System.out.println(palindorme.substring(11,15));

        //concatenation
        String firstname = "hello";
        String secondname = "world";
        System.out.println(firstname.concat(secondname));


    }
}
