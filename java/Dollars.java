import java.util.Scanner;

public class Dollars {
    public static final int TWENTY_DOLLAR_BILL = 20;
    public static final int TEN_DOLLAR_BILL = 10;
    public static final int FIVE_DOLLAR_BILL = 5;
    public static final int ONE_DOLLAR_BILL = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入美元數量: ");
        int dollars = scanner.nextInt();

        int twenties = dollars / TWENTY_DOLLAR_BILL;
        dollars %= TWENTY_DOLLAR_BILL;

        int tens = dollars / TEN_DOLLAR_BILL;
        dollars %= TEN_DOLLAR_BILL;

        int fives = dollars / FIVE_DOLLAR_BILL;
        dollars %= FIVE_DOLLAR_BILL;

        int ones = dollars / ONE_DOLLAR_BILL;

        System.out.printf("您有 %d 張 $20, %d 張 $10, %d 張 $5, 和 %d 張 $1.%n",
                twenties, tens, fives, ones);
    }
}