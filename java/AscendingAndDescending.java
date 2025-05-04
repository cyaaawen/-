import java.util.Arrays;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("Enter the first integer: ");
        numbers[0] = input.nextInt();
        System.out.print("Enter the second integer: ");
        numbers[1] = input.nextInt();
        System.out.print("Enter the third integer: ");
        numbers[2] = input.nextInt();

        Arrays.sort(numbers);

        System.out.println("Ascending order: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
        System.out.println("Descending order: " + numbers[2] + " " + numbers[1] + " " + numbers[0]);
    }
}
