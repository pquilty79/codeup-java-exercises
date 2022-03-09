package Shapes;

public class oldRectangle {
    protected double length;
    protected double width;

    public oldRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }
    public double getArea(){
        return this.width * this.length;
    }

}
