import java.util.Scanner;

public class MileConversions {
    public static final int INCHES_IN_A_MILE = 63360;
    public static final int FEET_IN_A_MILE = 5280;
    public static final int YARDS_IN_A_MILE = 1760;
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入英里數: ");
        int miles = scanner.nextInt();

        int inches = miles * INCHES_IN_A_MILE;
        int feet = miles * FEET_IN_A_MILE;
        int yards = miles * YARDS_IN_A_MILE;

        System.out.println(miles + " 英里等於 " + inches + " 英寸, " + feet + " 英尺, 和 " + yards + " 碼.");
    }
}
