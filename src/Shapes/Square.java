package Shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    public double getPerimeter(){
        return Square.length * 4;
    }
    public double getArea(){
        return Math.pow(Square.length, 2);
    }


}

