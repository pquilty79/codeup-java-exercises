package Shapes;

public class Square extends Quadrilateral implements Measurable{
    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    @Override
    protected void setWidth(int side) {

    }

    @Override
    protected void setLength(int length) {

    }
}
