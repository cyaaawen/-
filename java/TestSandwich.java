// TestSandwich.java
import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sandwich sandwich = new Sandwich();

        // 提示使用者輸入主要成分
        System.out.print("Enter the main ingredient: ");
        sandwich.setMainIngredient(input.nextLine());

        // 提示使用者輸入麵包種類
        System.out.print("Enter the type of bread: ");
        sandwich.setBreadType(input.nextLine());

        // 提示使用者輸入價格
        System.out.print("Enter the price: ");
        sandwich.setPrice(input.nextDouble());

        // 顯示三明治的詳細資訊
        System.out.println("\nSandwich Details:");
        System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread Type: " + sandwich.getBreadType());
        System.out.println("Price: $" + sandwich.getPrice());
    }
}
