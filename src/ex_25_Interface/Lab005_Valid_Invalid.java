package ex_25_Interface;
//valid and invalid class and interfaces

public class Lab005_Valid_Invalid {
}

interface I11{}
interface I12{}

class A1{}
class A2{}

abstract class vol1{
    abstract void pp();
}

class Text extends A1{}
//class Text1 extends A1,A2{} //not possible we cannot do multiple inheritance using classes

class Text2 implements I11{}
class Text3 implements I11, I12{}

class Text4 extends A1 implements I11, I12 {}
//class Text5 implements A1 extends I11{} //not possible

//interface I13 extends A1{}

interface I14{}

interface T15{
    default void r(){

    }

    default void r1(){

    }

    static void s(){

    }
}
