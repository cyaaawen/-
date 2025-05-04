import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};

        System.out.println("Available services: oil change, tire rotation, battery check, brake inspection");
        System.out.print("Enter a service (at least the first three characters): ");
        String choice = scanner.nextLine().toLowerCase();

        boolean valid = false;
        for (int i = 0; i < services.length; i++) {
            if (services[i].toLowerCase().startsWith(choice)) {
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
