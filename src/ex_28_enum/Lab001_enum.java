package ex_28_enum;

public class Lab001_enum {
    public static void main(String[] args) {
        System.out.println(Day.Tuesday);
        System.out.println(Urls.Google);
    }
}

enum Day{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
}

enum Urls{
    Google, Edge, Firefox;
}


/*class A {
String Day [] = ["Sunday", "Monday", "Tuesday", "Friday", "Saturday]";
        }*/