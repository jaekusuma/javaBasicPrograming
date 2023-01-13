import java.lang.Math;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here
class Square extends Shape{
    Square(int x){
        width = x;
    }
    void area(){
        System.out.println(width * width);
    }
}

class Circle extends Shape{
    Circle(int x){
        width = x;
    }
    void area(){
        System.out.println(Math.PI * width * width);
    }
}

public class calculateSquareAndCircle {
    public static void main(String[ ] args) {
        Square a = new Square(5);
        Circle b = new Circle(2);
        a.area();
        b.area();
    }
}