import java.util.Scanner;

public class InchesToFeet {
    public static final int INCHES_IN_A_FOOT = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入英寸數: ");
        int inches = scanner.nextInt();

        int feet = inches / INCHES_IN_A_FOOT;
        int remainingInches = inches % INCHES_IN_A_FOOT;

        System.out.println(inches + " 英寸等於 " + feet + " 英尺和 " + remainingInches + " 英寸.");
    }
}