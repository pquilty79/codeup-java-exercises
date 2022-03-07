package Shapes;

public class Circle {
    private static double radius;

    public Circle(double radius) {
        Circle.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(Circle.radius, 2);
    }

    public double getCircumference() {
        return Math.PI * 2 * Circle.radius;
    }





}
