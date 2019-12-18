import java.util.Scanner;

public class LessonPrimitive {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        int count = leapYearCount(scanner.nextInt());
        System.out.println(count);
    }

    public static int leapYearCount (int year){
        int countYears = (year / 4) + (year / 400) - (year / 100);
        return countYears;
    }
}
