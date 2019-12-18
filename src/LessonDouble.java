
import java.util.Scanner;

public class LessonDouble {
    public static void main(String[] args) {
        System.out.println(doubleBoolean(0.2, 0.2, 0.4));
    }

    public static boolean doubleBoolean (double a, double b, double c) {
        return Math.abs((a+b)-c) < 0.0001;
    }
}