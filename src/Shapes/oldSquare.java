package Shapes;

public class oldSquare extends oldRectangle {
    public oldSquare(double side) {
        super(side, side);
    }
    public double getPerimeter(){
        return this.length * 4;
    }
    public double getArea(){
        return Math.pow(this.length, 2);
    }


}

