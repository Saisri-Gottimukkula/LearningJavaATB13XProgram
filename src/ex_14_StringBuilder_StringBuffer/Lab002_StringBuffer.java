package ex_14_StringBuilder_StringBuffer;

public class Lab002_StringBuffer {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("saisri");
        s1.append("gottimukkula");
        System.out.println(s1);

        System.out.println(s1.reverse());

    }
}

//append -> it adds the value