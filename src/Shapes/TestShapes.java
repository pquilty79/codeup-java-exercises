package Shapes;


public class TestShapes {
    public static void main(String[] args) {
//        oldRectangle box1 = new oldRectangle(4, 5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        oldRectangle box2 = new oldSquare(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };

        myShape = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

    }
}
