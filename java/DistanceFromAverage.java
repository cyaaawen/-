import java.util.ArrayList;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        double input;

        System.out.println("Enter up to 15 double values (99999 to quit):");

        while (numbers.size() < 15) {
            input = scanner.nextDouble();
            if (input == 99999) break;
            numbers.add(input);
        }

        if (numbers.isEmpty()) {
            System.out.println("Error: No numbers entered.");
        } else {
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }

            double average = sum / numbers.size();
            System.out.println("Numbers entered: " + numbers.size());
            System.out.println("Average: " + average);
            System.out.println("Values and their distances from the average:");

            for (double num : numbers) {
                System.out.printf("Value: %.2f, Distance: %.2f%n", num, Math.abs(num - average));
            }
        }
    }
}
