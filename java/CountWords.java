import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[] words = input.split("[\\s.,;?!-]+");
        System.out.println("Word count: " + words.length);
    }
}
