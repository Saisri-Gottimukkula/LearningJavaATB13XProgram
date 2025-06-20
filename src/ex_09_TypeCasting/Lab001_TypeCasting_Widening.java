package ex_09_TypeCasting;

public class Lab001_TypeCasting_Widening {
    public static void main(String[] args) {
        byte a=10; // widening - implicit casting
        int b=a;
        int a1 = (int)b;//widening - explicit casting but while widening JVM says no need to do  explicit casting as it is does implicitly

    }
}
//widening -> small to big (automatically done by java)
//here we are converting byte to int and jvm has no problem doing this
//in widening if you mention or not its not a problem