package Shapes;

public class OldSquare extends OldRectangle {
    public OldSquare(double side) {
        super(side, side);
    }
    public double getPerimeter(){
        return this.length * 4;
    }
    public double getArea(){
        return Math.pow(this.length, 2);
    }


}

