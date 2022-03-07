package util;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(getString());
//        System.out.println(getInt(10, 20));
//        System.out.println(getInt());
        System.out.println(input.yesNo("Continue?"));
        System.out.println(input.yesNo("Continue?"));
//        System.out.println(getDouble(1.0, 10.3));
//        System.out.println(getDouble());
//        System.out.println(yesNo("Continue?"));
        input.close();
    }
}
