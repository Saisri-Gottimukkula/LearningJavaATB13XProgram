package ex_25_Interface;

public class Lab001_Interface {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getarea(3,5);

        Square s = new Square();
        s.getarea(3,5);
    }
}

interface Polygon{
    void getarea(int length, int breadth);
}

class Rectangle implements Polygon{

    @Override
    public void getarea(int length, int breadth) {
        System.out.println("Area of Rectangle: " + length * breadth);
    }
}

class Square implements Polygon{

    @Override
    public void getarea(int length, int breadth) {
        System.out.println("Area of square: " + 3.14 * length * breadth);
    }
}