package Shapes;
import util.input;


public class circleApp {
    public static void newCircle() {
            input input = new input();
            Circle circle = new Circle(input.getDouble());
            System.out.println("The area of your circle is " + circle.getArea());
            System.out.println("The circumference of your circle is " + circle.getCircumference());


    }
    public static void main(String[] args) {
        input input = new input();
        int circles = 0;
        do {
            newCircle();
            circles ++;
        }
          while(input.yesNo("Would you like to make another circle?"));
        System.out.printf("You have created %d circles", circles);
        input.close();
          }

}