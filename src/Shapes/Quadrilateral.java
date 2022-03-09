package Shapes;

abstract public class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;


    abstract protected void setWidth(int width);
    abstract protected void setLength(int length);

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
