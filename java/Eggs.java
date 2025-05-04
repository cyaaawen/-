import java.util.Scanner;

public class Eggs {
    public static final double DOZEN_PRICE = 3.25;
    public static final double SINGLE_EGG_PRICE = 0.45;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入雞蛋的數量: ");
        int numberOfEggs = scanner.nextInt();

        int dozens = numberOfEggs / 12;
        int singles = numberOfEggs % 12;

        double totalCost = (dozens * DOZEN_PRICE) + (singles * SINGLE_EGG_PRICE);

        System.out.printf("您訂購了 %d 個雞蛋。那是 %d 打每打 $%.2f 和 %d 個散裝雞蛋每個 $%.2f，總共 $%.2f.%n",
                numberOfEggs, dozens, DOZEN_PRICE, singles, SINGLE_EGG_PRICE, totalCost);
    }
}