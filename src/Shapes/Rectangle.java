package Shapes;

public class Rectangle {
    protected static double length;
    protected static double width;

    public Rectangle(double length, double width) {
        Rectangle.length = length;
        Rectangle.width = width;
    }

    public double getPerimeter(){
        return 2 * (Rectangle.width + Rectangle.length);
    }
    public double getArea(){
        return Rectangle.width * Rectangle.length;
    }

}
