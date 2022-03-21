package util;


public class InputTest {
    public static void main(String[] args) {
        input input = new input();
//        System.out.println(input.getString());
//        System.out.println(input.getInt(10, 20));
//        System.out.println(input.getInt(1,3));
//        System.out.println(input.getInt());
//        System.out.println(input.yesNo("Continue?"));
//        System.out.println(input.yesNo("Continue?"));
        System.out.println(input.getDouble(1.0, 10.3));
//        System.out.println(input.getDouble());
//        System.out.println(input.yesNo("Continue?"));
//        System.out.println(input.getBinary());
//        System.out.println(input.getHex());
        input.close();
    }
}
