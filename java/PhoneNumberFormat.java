import java.util.Scanner;

public class PhoneNumberFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter a 10-digit phone number (or 999 to quit): ");
            input = scanner.nextLine();

            if (input.equals("999")) break;

            if (input.matches("\\d{10}")) {
                String formatted = String.format("(%s) %s-%s", 
                    input.substring(0, 3), input.substring(3, 6), input.substring(6));
                System.out.println("Formatted phone number: " + formatted);
            } else {
                System.out.println("Invalid input. Please enter exactly 10 digits.");
            }
        } while (true);
    }
}
