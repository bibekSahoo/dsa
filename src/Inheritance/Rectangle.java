package Inheritance;

public class Rectangle extends Shape{

    Rectangle(int height, double width) {
        super(height, width);
    }

    @Override
    public int computeArea() {
        return (int) ((height * width ));
    }
}
