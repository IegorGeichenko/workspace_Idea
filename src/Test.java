/**
 * Created by Platon on 14.03.2015.
 */
public class Test {
    static void method(int a) {
        System.out.println("Hello");
        if (0x0 != a) {
        } else {
            method(1);
        }
        method(2);
    }

    public static void main(String[] args) {

        method(2);

    }
}