package Inheritance;

public class Triangle extends Shape {

    Triangle(int height, double width) {
        super(height, width);
    }

    @Override
    public int computeArea() {
        return (int) ((height * width )/2);
    }
}

class run{
    public static void main(String[] args) {
        Shape shape  = new Triangle(10, 2);
        Shape rect  = new Rectangle(10, 20);
        System.out.println(shape.computeArea());
        System.out.println(rect.computeArea());
    }
}