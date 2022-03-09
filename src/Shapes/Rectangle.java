package Shapes;

import java.lang.reflect.MalformedParametersException;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public void setLength(int length) {

    }
}
