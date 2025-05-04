import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        displayAll(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan12(numbers);
        displayAboveAverage(numbers);
    }

    public static void displayAll(int[] numbers) {
        System.out.println("All numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void displayReverse(int[] numbers) {
        System.out.println("Numbers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void displaySum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }

    public static void displayLessThan12(int[] numbers) {
        System.out.println("Numbers less than 12:");
        boolean found = false;
        for (int number : numbers) {
            if (number < 12) {
                System.out.print(number + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No numbers less than 12.");
        }
        System.out.println();
    }

    public static void displayAboveAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / (double) numbers.length;

        System.out.println("Numbers above average (" + average + "):");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
