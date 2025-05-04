import java.util.Scanner;

public class ChiliToGoProfit {
    public static final double ADULT_MEAL_PRICE = 7.00;
    public static final double CHILD_MEAL_PRICE = 4.00;
    public static final double ADULT_MEAL_COST = 4.35;
    public static final double CHILD_MEAL_COST = 3.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入成人餐的數量: ");
        int adultMeals = scanner.nextInt();
        System.out.print("請輸入兒童餐的數量: ");
        int childMeals = scanner.nextInt();

        double totalAdult = adultMeals * ADULT_MEAL_PRICE;
        double totalChild = childMeals * CHILD_MEAL_PRICE;
        double total = totalAdult + totalChild;

        double profitAdult = (ADULT_MEAL_PRICE - ADULT_MEAL_COST) * adultMeals;
        double profitChild = (CHILD_MEAL_PRICE - CHILD_MEAL_COST) * childMeals;
        double totalProfit = profitAdult + profitChild;

        System.out.printf("成人餐總收入: $%.2f, 兒童餐總收入: $%.2f, 所有餐的總收入: $%.2f.%n",
                totalAdult, totalChild, total);
        System.out.printf("成人餐總利潤: $%.2f, 兒童餐總利潤: $%.2f, 總利潤: $%.2f.%n",
                profitAdult, profitChild, totalProfit);
    }
}