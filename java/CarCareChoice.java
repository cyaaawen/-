import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};

        System.out.println("Available services: oil change, tire rotation, battery check, brake inspection");
        System.out.print("Enter a service: ");
        String choice = scanner.nextLine();

        boolean valid = false;
        for (int i = 0; i < services.length; i++) {
            if (choice.equalsIgnoreCase(services[i])) {
                System.out.println("Service: " + services[i] + ", Price: $" + prices[i]);
                valid = true;
                break;
            }
        }

        if (!valid) {
            System.out.println("Error: Invalid service.");
        }
    }
}
